package Part2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Part1.Book;
import Part1.Patron;

class LibraryApplication {

    public static LocalDate date;
    public List<Book>books=new ArrayList<>();
    public List<Patron> borrowers = new ArrayList<>();

    public LibraryApplication() {
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addBorrower(Patron borrower) {
        borrowers.add(borrower);
    }

    public void loanBook(Book book , Patron patron) {
        List<Integer>ids=new ArrayList<>();

        Book borrowedBook = book;
        Patron borrower = patron;

        borrowedBook.setIdBorrowed(borrower.getId());

        for (Patron patron1 : borrowers) {
            if(patron1.equals(borrower)) {
                ids.add(borrowedBook.getCatallogId());
                borrower.setCatallogIds(new int[1]);
            }else {
                borrowedBook.setIdBorrowed(borrower.getId());
                ids.add(borrowedBook.getCatallogId());
                borrower.setCatallogIds(new int[1]);
                borrowers.add(borrower);
            }
        }

    }
    public void returnBook(Book book,Patron patron) {

        for (Book book2 : books) {
            if(book2.equals(book)) {
                borrowers.remove(patron);
            }
        }
    }
    public String showBorrowers() {
        String temp = borrowers.toString();

        return temp;
    }
    public static void main(String[] args) {

        Patron patron = new Patron("patron","address", 4,new int[1]);
        Book book = new Book("book", "author", 0, 0,date, 0);
        Book book1 = new Book("book1", "author", 1, 0, date,0);
        Book book2 = new Book("book2", "author", 2, 0,date, 0);
        Book book3 = new Book("book3", "author", 3, 0,date, 0);

        LibraryApplication library = new LibraryApplication();
        library.addBorrower(patron);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.loanBook(book, patron);
        library.loanBook(book1, patron);
        library.loanBook(book2, patron);
        library.loanBook(book3, patron);
        library.showBorrowers();

        library.returnBook(book3, patron);

        System.out.println(library.showBorrowers());

    }

}
