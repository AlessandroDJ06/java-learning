package week2;
import java.util.Scanner;

public class Verbruik {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int vorigeKilometerstand,huidigeKilometerstand,aantalKilometers;
        double aantalGetankteLiters,verbruik;

        System.out.print("Geef de vorige kilometerstand: ");
        vorigeKilometerstand = scanner.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKilometerstand = scanner.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        aantalGetankteLiters = scanner.nextDouble();

        aantalKilometers = huidigeKilometerstand - vorigeKilometerstand;
        verbruik = (aantalGetankteLiters/aantalKilometers)*100;

        System.out.printf("Verbruik voor %dkm: %.2f liter/100km", aantalKilometers,verbruik);
    }
}
