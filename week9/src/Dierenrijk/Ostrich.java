package Dierenrijk;

public class Ostrich implements LaysEggs,Animal{
    private String name;
    private int amountOffEggsPerYear;

    public Ostrich(String name,int amountOffEggsPerYear){
        this.name =name;
        this.amountOffEggsPerYear = amountOffEggsPerYear;
    }

    public int getAmountOfEggsPerYear() {
        return amountOffEggsPerYear;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name:'" + name + '\'' +
                ", amountOffEggsPerYear:" + amountOffEggsPerYear;
    }
}
