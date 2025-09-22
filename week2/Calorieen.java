package week2;
import java.util.Scanner;

public class Calorieen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final long GEMIDDELDE_CALORIEEN = 2256L;
        final long CALORIEEN_IN_PIZZA = 906L;
        final long MINIMUM_INWONERS = 1_000_000L;

        long inwoners, totalecalorien, aantalpizzas;
        String land;

        System.out.print("Geef de naam van het land: ");
        land = scanner.next();
        System.out.printf("Hoeveel mensen wonen er in %s ? ", land);
        inwoners = scanner.nextLong();

        while (inwoners < MINIMUM_INWONERS) {
            System.out.print("Fout! Dit getal is veel te klein!");
            System.out.printf("\nHoeveel mensen wonen er in %s ? ", land);
            inwoners = scanner.nextLong();
        }

        totalecalorien = inwoners * GEMIDDELDE_CALORIEEN;
        aantalpizzas = totalecalorien / CALORIEEN_IN_PIZZA;

        System.out.printf(
                "In %s verbruiken alle inwoners samen %d calorieën per dag.%n" +
                        "Dat komt overeen met %d pizza's per dag.%n",
                land, totalecalorien, aantalpizzas
        );

        scanner.close();
    }
}
