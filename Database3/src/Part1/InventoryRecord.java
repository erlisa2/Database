package Part1;

import java.util.Objects;

public class InventoryRecord {

    private String name;
    private int id;
    private double wholesalePrice;
    private double retailPrice;
    private int quantityStock;

    public InventoryRecord(String name, int id, double wholesalePrice, double retailPrice, int quantityStock) {
        this.name = name;
        this.id = id;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    @Override
    public String toString() {
        return "InventoryRecord{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", wholesalePrice=" + wholesalePrice +
                ", retailPrice=" + retailPrice +
                ", quantityStock=" + quantityStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryRecord that = (InventoryRecord) o;
        return id == that.id && Double.compare(that.wholesalePrice, wholesalePrice) == 0 && Double.compare(that.retailPrice, retailPrice) == 0 && quantityStock == that.quantityStock && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, wholesalePrice, retailPrice, quantityStock);
    }
}