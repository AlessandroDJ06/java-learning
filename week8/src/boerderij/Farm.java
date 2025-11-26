package boerderij;

public class Farm {
    private final int MAX_LENGHT = 5;
    private FarmAnimal[] animals;
    private int amountOfAnimals;

    public Farm(){
        this.animals = new FarmAnimal[this.MAX_LENGHT];
        this.amountOfAnimals = 0;
    }

    public void addAnimal(FarmAnimal animal){
        if (this.amountOfAnimals < MAX_LENGHT){
            this.animals[amountOfAnimals] = animal;
            amountOfAnimals++;

        } else {
            System.out.printf("Er is geen plaats meer voor %s.  De boerderij zit vol!",animal);

        }
    }

    public void showAnimals(){
        for (int i = 0; i < this.amountOfAnimals; i++) {
            System.out.println(this.animals[i]);
        }
    }

    public void showSounds(){
        for (int i = 0; i < this.amountOfAnimals; i++) {
            System.out.println(this.animals[i].getName()+" "+this.animals[i].getSound());
        }
    }

    public void showFoods(){
        for (int i = 0; i < this.amountOfAnimals; i++) {
            System.out.println(this.animals[i].getName()+" "+this.animals[i].getFood());
        }
    }

    public FarmAnimal findAnimalByName(String name){
        if (name == null ) return null;

        for (int i = 0; i < this.amountOfAnimals; i++) {


            if (this.animals[i].getName().equalsIgnoreCase(name)){
                return this.animals[i];
            }
        }
        return null;
    }




}
