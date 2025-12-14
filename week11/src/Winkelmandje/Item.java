package Winkelmandje;

import java.util.Objects;

abstract class Item {
    private String id;
    private double price;

    public Item(String id,double price){
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Item item)) return false;
        return Double.compare(getPrice(), item.getPrice()) == 0 && Objects.equals(getId(), item.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPrice());
    }

    public abstract String getTitle();


}
