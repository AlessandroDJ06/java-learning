package printer;

public class Cuboid extends PrimitiveObject{
    private double[] size;

    public Cuboid(double x, double y, double z , double width, double height, double depth){
        super(x,y,z);
        this.size = new double[]{width,height,depth};
    }

    public double getWidth(){
        return this.size[0];
    }
    public double getHeight(){
        return this.size[1];
    }
    public double getDepth(){
        return this.size[2];
    }

    @Override
    public double volume(){
        return getWidth() * getDepth() * getHeight();
    }

    public String partialToString(){
        return String.format("met afmetingen (%.2f %.2f %.2f)",getDepth(),getHeight(),getWidth()) + super.toString();
    }

    @Override
    public String toString(){
        return String.format("Balk %s",partialToString());
    }
}
