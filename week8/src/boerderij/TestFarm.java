package boerderij;

public class TestFarm {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Rabbit("Bugs", true));
        farm.addAnimal(new Cow("Belle", 15.4));
        farm.addAnimal(new Rabbit("Bunny", false));
        farm.addAnimal(new Chicken("Generaal Kiekens", 3));
        farm.addAnimal(new Chicken("Chick", 4));
        farm.addAnimal(new Cow("Hannibal", 0));

        System.out.println("--------\ntoonDieren:\n");
        farm.showAnimals();
        System.out.println("--------\nEr ontploft een BOM! Paniek op de boerderij:\n");
        farm.showSounds();
        System.out.println("--------\netenstijd:\n");
        farm.showFoods();
        System.out.println("--------\nzoeken:\n");
        FarmAnimal animal = farm.findAnimalByName("Belle");
        if (animal != null) {
            System.out.println(animal);
        } else {
            System.out.println("Belle niet gevonden");
        }
        animal = farm.findAnimalByName("Jef");
        if (animal != null) {
            System.out.println(animal);
        } else {
            System.out.println("Jef niet gevonden");
        }
    }
}