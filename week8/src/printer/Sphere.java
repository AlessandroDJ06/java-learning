package printer;

public class Sphere extends PrimitiveObject{
    private double radius;

    public Sphere(double x, double y, double z ,double radius){
        super(x,y,z);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double volume(){
        return ((double)4/3 * Math.PI*Math.pow(this.radius,3));
    }

    @Override
    public String toString(){
        return String.format("een bol met een radius van %.2f op plaats ",this.radius) + super.toString();
    }
}
