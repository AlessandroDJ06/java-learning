package Dierenrijk;

public class Swallow implements LaysEggs,Animal,CanFly{
    private String name;
    private int amountOffEggsPerYear;
    private double maxFlyingSpeed;

    public Swallow(String name,int amountOffEggsPerYear,double maxFlyingSpeed){
        this.name = name;
        this.amountOffEggsPerYear = amountOffEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAmountOfEggsPerYear() {
        return amountOffEggsPerYear;
    }

    @Override
    public double getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    @Override
    public String toString() {
        return "name:'" + name + '\'' +
                ", amountOffEggsPerYear:" + amountOffEggsPerYear +
                ", maxFlyingSpeed:" + maxFlyingSpeed;
    }
}
