package week2;
import java.util.Scanner;

public class Verbruik {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int vorigeKilometerstand,huidigeKilometerstand;
        double aantalGetankteLiters;

        System.out.print("Geef de vorige kilometerstand: ");
        vorigeKilometerstand = scanner.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKilometerstand = scanner.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        aantalGetankteLiters = scanner.nextDouble();
    }
}
