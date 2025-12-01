package Transportmiddelen;

abstract class MeansOfTransport {
    private double speed;

    public MeansOfTransport(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return this.speed;
    }

    abstract String travelDistance(double distance);



}
