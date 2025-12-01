package Laptops;

public class Laptops {
    private final int MAX_LAPTOPS = 2000;
    private Laptop[] laptops;
    private int amount;

    public Laptops(){
        this.amount = 0;
        this.laptops = new Laptop[MAX_LAPTOPS];
    }

    public void addLaptop(Laptop laptop){
        if (amount < MAX_LAPTOPS){
            laptops[amount] = laptop;
            amount++;
        }
    }

    public Laptop getLaptop(int index){
        return (index < MAX_LAPTOPS)? laptops[index]:null;
    }

    public int getAmount() {
        return amount;
    }
}
