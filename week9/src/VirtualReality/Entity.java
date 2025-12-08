package VirtualReality;

abstract class Entity {
    private String name;
    protected double[] position;

    public Entity(String name, double[] position){
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double[] getPosition() {
        return position;
    }

    public String toString(){
        return String.format("%s ( %.2f , %.2f , %.2f)",name,position[0],position[1],position[2]);
    }
}
