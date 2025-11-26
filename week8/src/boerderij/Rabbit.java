package Boerderijdieren;

public class Rabbit extends FarmAnimal{
    private boolean likesDigging;

    public Rabbit(String name, boolean likesDigging){
        super(name,"SnifSnif","gras");
        this.likesDigging = likesDigging;
    }
    public boolean getLikesDigging(){
        return this.likesDigging;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("en graaft %s graag",(this.likesDigging)? "":"niet");
    }
}
