package Dierenrijk;

public class Animals {
    private final int MAX_ANIMALS = 100;
    private Animal[] animals;
    private int amount;

    public Animals(){
        this.animals = new Animal[MAX_ANIMALS];
        this.amount = 0;
    }

    public void add(Animal animal){
        if (amount < MAX_ANIMALS){
            animals[amount] = animal;
            amount++;
        }
    }

    public void show(){
        for (int i = 0; i<amount;i++){
            System.out.println(animals[i]);
        }
    }
}
