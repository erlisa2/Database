package Part2;

public class Database {
    private User[] base = new User[1000];
    private int NOT_FOUND = -1;

    public Database(int i) {
    }

    private int findLocation(Key k) {
        int result = this.NOT_FOUND;
        boolean found = false;
        int i = 0;

        while(!found && i != this.base.length) {
            if (this.base[i] != null && this.base[i].getKey().equals(k)) {
                found = true;
                result = i;
            } else {
                ++i;
            }
        }

        return result;
    }

    public User find(Key k) {
        User answer = null;
        int index = this.findLocation(k);
        if (index != this.NOT_FOUND) {
            answer = this.base[index];
        }

        return answer;
    }

    public boolean insert(User r) {
        boolean success = false;
        if (this.findLocation(r.getKey()) == this.NOT_FOUND) {
            boolean found_empty_place = false;
            int i = 0;

            while(!found_empty_place && i != this.base.length) {
                if (this.base[i] == null) {
                    found_empty_place = true;
                } else {
                    ++i;
                }
            }

            if (found_empty_place) {
                this.base[i] = r;
            } else {
                User[] temp = new User[this.base.length * 2];

                for(int j = 0; j != this.base.length; ++j) {
                    temp[j] = this.base[j];
                }

                temp[this.base.length] = r;
                this.base = temp;
            }

            success = true;
        }

        return success;
    }

    public boolean delete(Key k) {
        boolean result = false;
        int index = this.findLocation(k);
        if (index != this.NOT_FOUND) {
            this.base[index] = null;
            result = true;
        }

        return result;
    }
}
