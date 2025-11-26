package Boerderijdieren;

public class Cow extends FarmAnimal{
    private double literMilkPerDay;

    public Cow(String name,double literMilkPerDay){
        super(name,"BoeBoe","gras");
        this.literMilkPerDay = literMilkPerDay;
    }

    public double getLiterMilkPerDay() {
        return literMilkPerDay;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("en geeft %.2f liter melk per dag",this.literMilkPerDay);
    }
}
