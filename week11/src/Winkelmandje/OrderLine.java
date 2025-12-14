package Winkelmandje;

import java.util.Objects;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item,int amount){
        this.item = item;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Item getItem() {
        return item;
    }

    public double getPrice(){
        return item.getPrice();
    }

    public void incrementAmount(){
        amount++;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof OrderLine orderLine)) return false;
        return Objects.equals(getItem(), orderLine.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItem());
    }

    @Override
    public String toString() {
        return String.format("%40s %d \n%.2f",this.item,amount,getPrice()*amount);
    }
}
