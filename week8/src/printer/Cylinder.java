package printer;

public class Cylinder extends PrimitiveObject{
    private double radius;
    private double height;

    public Cylinder(double x, double y, double z, double radius, double height){
        super(x,y,z);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double volume(){
        return Math.PI * Math.pow(this.radius,2) * this.height;
    }

    @Override
    public String toString(){
        return String.format("Cylinder met straal %.2f en hoogte %.2f op plaats ",this.radius,this.height) + super.toString();
    }
}
