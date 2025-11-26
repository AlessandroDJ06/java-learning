package printer;

public class PrimitiveObject {
    private double[] position;

    public PrimitiveObject(double x, double y , double z){
        this.position = new double[] {x,y,z} ;
    }

    public PrimitiveObject(){
        this(0,0,0);
    }

    public double getX(){
        return position[0];
    }

    public double getY(){
        return position[1];
    }

    public double getZ(){
        return position[2];
    }

    public double volume(){
        return 0;
    }

    @Override
    public String toString() {
        return String.format("(%.2f %.2f %.2f) en volume %.2f ",getX(),getY(),getZ(),volume());
    }
}
