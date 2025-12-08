package EenMooiFiguur;

public class Sphere extends Figure implements HasVolume{
    private double radius;

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double volume(){
        return (double)4/3 * Math.PI * Math.pow(radius,3);
    }
}
