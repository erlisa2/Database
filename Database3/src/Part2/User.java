package Part2;
import Part1.Record;

public class User extends Record {
    private Key address;

    public User(Key a, String p) {
        this.address = a;
    }

    public Key getKey() {
        return this.address;
    }

    public String getAddress() {
        return this.address.getString();
    }

}