package VirtualReality;

public class Player extends Entity implements Alive,Visible{
    private int numberOfLives;

    public Player(String name,double[] position, int numberOfLives){
        super(name, position);
        this.numberOfLives = numberOfLives;
    }

    @Override
    public void draw() {
        System.out.println("Player: " + super.toString());
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

    @Override
    public int getNumberOfLives() {
        return numberOfLives;
    }
}
