package EenMooiFiguur;

public class Line extends Figure implements HasBorder{
    private double length;

    public Line(String name,double length){
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double circumference(){
        return length;
    }
}
