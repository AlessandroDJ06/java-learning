package printer;

public class Cube extends Cuboid{

    public Cube(double x, double y, double z, double width){
        super(x,y,z,width,width,width);
    }

    @Override
    public String toString(){
        return String.format("kubus ") + super.partialToString() ;
    }

}
