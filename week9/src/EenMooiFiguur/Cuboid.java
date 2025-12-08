package EenMooiFiguur;

public class Cuboid extends Figure implements HasVolume{
    private Rectangle base;
    private double height;

    public Cuboid(String name, double length, double width, double height){
        super(name);
        this.base = new Rectangle(name,length,width);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public double getLength(){
        return base.getLenght();
    }

    public double getWidth(){
        return base.getWidth();
    }

    @Override
    public double volume(){
        return base.area() * height;
    }


}
