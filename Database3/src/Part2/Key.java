package Part2;

public class Key {
    private String k;

    public Key(String s) {
        this.k = s;
    }

    public boolean equals(Key i) {
        return this.k.equals(i.getString());
    }

    public String getString() {
        return this.k;
    }
}
