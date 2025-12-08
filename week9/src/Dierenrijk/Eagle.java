package Dierenrijk;

public class Eagle implements LaysEggs,Animal,CanFly{
    private String name;
    private int amountOffEggsPerYear;
    private double maxFlyingSpeed;
    private double maxDivingSpeed;

    public Eagle(String name,int amountOffEggsPerYear,double maxFlyingSpeed,double maxDivingSpeed){
        this.name = name;
        this.amountOffEggsPerYear = amountOffEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
        this.maxDivingSpeed = maxDivingSpeed;
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

    public double getMaxDivingSpeed() {
        return maxDivingSpeed;
    }

    @Override
    public String toString() {
        return "name:'" + name + '\'' +
                ", amountOffEggsPerYear:" + amountOffEggsPerYear +
                ", maxFlyingSpeed:" + maxFlyingSpeed +
                ", maxDivingSpeed:" + maxDivingSpeed ;
    }
}
