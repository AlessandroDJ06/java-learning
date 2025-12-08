package EenMooiFiguur;

public class Rectangle extends Figure implements HasBorder,HasSurface{
    private double lenght;
    private double width;

    public Rectangle(String name,double lenght,double width){
        super(name);
        this.lenght = lenght;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public double circumference(){
        return 2*lenght + 2*width;
    }

    @Override
    public double area(){
        return lenght*width;
    }
}
