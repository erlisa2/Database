package Part1;

import java.util.Arrays;
import java.util.Objects;

public class Patron extends Record{

    private String name;
    private String address;
    private int id;
    private int catallogIds [];

    public Patron(String name, String address, int id, int[] catallogIds) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.catallogIds = catallogIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getCatallogIds() {
        return catallogIds;
    }

    public void setCatallogIds(int[] catallogIds) {
        this.catallogIds = catallogIds;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", catallogIds=" + Arrays.toString(catallogIds) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patron patron = (Patron) o;
        return id == patron.id && Objects.equals(name, patron.name) && Objects.equals(address, patron.address) && Arrays.equals(catallogIds, patron.catallogIds);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, address, id);
        result = 31 * result + Arrays.hashCode(catallogIds);
        return result;
    }
}