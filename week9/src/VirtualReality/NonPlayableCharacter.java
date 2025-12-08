package VirtualReality;
import java.util.Random;

public class NonPlayableCharacter extends Entity implements Alive,Visible{
    private int numberOfLives;
    private Random random;

    public NonPlayableCharacter(String name, double[] position, int numberOfLives){
        super(name,position);
        this.numberOfLives = (numberOfLives < 1)? 1:numberOfLives ;
        this.random= new Random(42);
    }

    @Override
    public void draw() {
        System.out.println("Non playable character: " + super.toString());
    }

    @Override
    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void kill() {
        if (getNumberOfLives() >= 1){
            System.out.println(super.getName() +": Aaaaaaarrrrrrgggghhh");
            numberOfLives--;
        } else {
            System.out.println(super.getName() +": is dood");
        }
    }

    public void animate(){
        super.position[0] += random.nextInt(-10,10);
        super.position[1] += random.nextInt(-10,10);
        super.position[2] += random.nextInt(-10,10);
    }
}
