package week2;
import java.util.Scanner;

public class Korting {
    public static void main(String[] args) {
        double bedrag;
        int aantalBesteldeArtikelen;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef het bedrag: ");
        bedrag = scanner.nextDouble();

        System.out.print("geef het aantal artikelen");
        aantalBesteldeArtikelen = scanner.nextInt();

        if (bedrag > 150 && (10 <= aantalBesteldeArtikelen && aantalBesteldeArtikelen <= 20) || aantalBesteldeArtikelen > 100){
            System.out.print("De klant krijgt WEL korting");
        }else {
            System.out.print("De klant krijgt GEEN korting");
        }
    }
}
