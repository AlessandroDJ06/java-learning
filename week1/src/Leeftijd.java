package week1.src;
import java.util.Scanner;
import java.time.LocalDate;
public class Leeftijd {
    public static void main(String[] args) {
        String naam;
        int huidigJaar = LocalDate.now().getYear();
        int geboorteDatum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is je naam: ");
        naam = scanner.next();
        System.out.print("wat is je geboortedatum: ");
        geboorteDatum = scanner.nextInt();
        System.out.print("hey "+ naam + " je leeftijd is: " + (huidigJaar - geboorteDatum) + " jaar");

    }
}
