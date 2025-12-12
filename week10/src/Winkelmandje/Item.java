package Winkelmandje;

abstract class Item{
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
}
