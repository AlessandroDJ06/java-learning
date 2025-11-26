package Boerderijdieren;

public class FarmAnimal {
    private String name;
    private String sound;
    private String food;

    public FarmAnimal(String name , String sound, String food){
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String toString(){
        return String.format("%s maakt geluid %s en de voeding moet \"%s\" ",this.name,this.sound,this.food);
    }
}
