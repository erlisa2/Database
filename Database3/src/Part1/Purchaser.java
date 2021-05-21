package Part1;
import Part2.Key;

import java.time.LocalDate;
import java.time.Period;

public class Purchaser {
    private Key id_number;
    private String name;
    private String address;
    private int[] order_id_nums;
    private LocalDate[] purchase_dates;

    public Purchaser(Key id, String n, String a, int[] o, LocalDate[] p) {
        this.id_number = id;
        this.name = n;
        this.address = a;
        this.order_id_nums = o;
        this.purchase_dates = p;
    }

    public Key getKey() {
        return this.id_number;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int[] getOrderIdNUms() {
        return this.order_id_nums;
    }

    public LocalDate[] getPurchaseHistory() {
        LocalDate now = LocalDate.now();
        LocalDate[] temp = new LocalDate[this.purchase_dates.length];

        for(int i = 0; i < this.purchase_dates.length; ++i) {
            Period p = Period.between(this.purchase_dates[i], now);
            if (p.getYears() < 1) {
                temp[i] = this.purchase_dates[i];
            }
        }
        return temp;
    }
}