package Drankenlijst;

public class Drink implements Comparable<Drink>{
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Drink(String name,double price,boolean isAlcoholic){
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String toString(){
        return String.format("%s €%.2f",name,price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    @Override
    public int compareTo(Drink drink) {
        int result = Double.compare(price,drink.getPrice());

        if (result != 0){
            return result;
        }
        return name.compareTo(drink.name);
    }

}
