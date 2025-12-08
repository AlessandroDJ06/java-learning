package Dierenrijk;

public class TestAnimals {
    public static void main(String[] args) {
        Animals animals = new Animals();

        animals.add(new Eagle("eagle", 2, 50, 160));
        animals.add(new Ostrich("struis", 6));
        animals.add(new Swallow("schwalbe", 4, 120));
        animals.show();

        Animal animal = new Eagle("eagle", 2, 50, 160);
        CanFly canFly = new Eagle("eagle", 2, 50, 160);
        LaysEggs laysEggs = new Eagle("eagle", 2, 50, 160);

        System.out.println("\n" + animal);
        System.out.println("\n" + canFly);
        System.out.println("\n" + laysEggs);
    }
}
