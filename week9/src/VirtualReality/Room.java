package VirtualReality;

public class Room extends Entity implements Visible{
    public Room(String name, double[] position){
        super(name,position);
    }
    @Override
    public void draw(){
        System.out.println("Room: " + super.toString());
    }
}
