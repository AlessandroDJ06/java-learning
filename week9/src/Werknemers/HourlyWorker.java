package Werknemers;

public class HourlyWorker extends Employee{
    private final int MAX_HOURS_PER_WEEK = 38;
    private int hours;

    public HourlyWorker(String name,long number,int hours){
        super(name,number);
        this.hours = hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double getWages(){
        if (hours > MAX_HOURS_PER_WEEK){
            return ((hours - MAX_HOURS_PER_WEEK)*(1.5*getHOURLY_WAGES())) + (MAX_HOURS_PER_WEEK*(1.5*getHOURLY_WAGES()));
        } else {
            return hours*(1.5*HOURLY_WAGES);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
