package VirtualReality;

public class Table extends Entity implements Movable,Visible{

    public Table(String name,double[] position){
        super(name,position);
    }

    @Override
    public void draw() {
        System.out.println("Table: " + super.toString());
    }

    @Override
    public void move(double[] position) {
        super.position[0] += position[0];
        super.position[1] += position[1];
        super.position[2] += position[2];

    }
}
