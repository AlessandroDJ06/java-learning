package Winkelmandje;

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
    public String toString() {
        return String.format("%40s %d \n%.2f",this.item,amount,getPrice()*amount);
    }
}
