package EenMooiFiguur;

public class Circle extends Figure implements HasSurface,HasBorder{
    private double radius;

    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double circumference(){
        return radius * Math.PI;
    }

    public double area(){
        return Math.pow(radius,2) * Math.PI;
    }
}
