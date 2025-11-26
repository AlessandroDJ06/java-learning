package Boerderijdieren;

public class Chicken extends FarmAnimal{
    private int eggsPerWeek;

    public Chicken(String name, int eggsPerWeek){
        super(name,"TokTok","mais");
        this.eggsPerWeek = eggsPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("en legt %d eieren per week.",this.eggsPerWeek);
    }
}
