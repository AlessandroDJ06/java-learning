package Werknemers;

public class SalariedEmployee extends Employee{
    private final int WAGE_FACTOR = 192;
    private double wageBarema;

    public SalariedEmployee(String name,long number,double wageBarema){
        super(name,number);
        this.wageBarema = wageBarema;
    }

    @Override
    public double getWages(){
        return getHOURLY_WAGES()*WAGE_FACTOR*wageBarema;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
