package boerderij;

public class Main {
    public static void main(String[] args) {
        Rabbit bugs = new Rabbit("Bugs", true);
        Cow belle = new Cow("Belle", 15.4);
        Rabbit bunny = new Rabbit("Bunny", false);
        Chicken kiekens = new Chicken("Generaal Kiekens", 3);
        Chicken chick = new Chicken("Chick", 4);
        Cow hannibal = new Cow("Hannibal", 3.2);

        System.out.println(bugs);
        System.out.println(belle);
        System.out.println(bunny);
        System.out.println(kiekens);
        System.out.println(chick);
        System.out.println(hannibal);


    }
}
