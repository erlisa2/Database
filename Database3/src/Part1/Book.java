package Part1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Book extends Record {

    private String name;
    private String author;
    private int catallogId;
    private int idBorrowed;
    private LocalDate dueDate;
    private int borrowedTimes;

    public Book(String name, String author, int catallogId, int idBorrowed, LocalDate dueDate, int borrowedTimes) {
        this.name = name;
        this.author = author;
        this.catallogId = catallogId;
        this.idBorrowed = idBorrowed;
        this.dueDate = dueDate;
        this.borrowedTimes = borrowedTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCatallogId() {
        return catallogId;
    }

    public void setCatallogId(int catallogId) {
        this.catallogId = catallogId;
    }

    public int getIdBorrowed() {
        return idBorrowed;
    }

    public void setIdBorrowed(int idBorrowed) {
        this.idBorrowed = idBorrowed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getBorrowedTimes() {
        return borrowedTimes;
    }

    public void setBorrowedTimes(int borrowedTimes) {
        this.borrowedTimes = borrowedTimes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", catallogId=" + catallogId +
                ", idBorrowed=" + idBorrowed +
                ", dueDate=" + dueDate +
                ", borrowedTimes=" + borrowedTimes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return catallogId == book.catallogId && idBorrowed == book.idBorrowed && borrowedTimes == book.borrowedTimes && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(dueDate, book.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, catallogId, idBorrowed, dueDate, borrowedTimes);
    }
}