package Transportmiddelen;

public class Bus extends MeansOfTransport{

    public Bus(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        return "afgelegde afstand is: " + (int)(distance*10)/super.getSpeed();
    }

    public String toString(){
        return
    }
}
