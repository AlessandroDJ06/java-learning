package week1;
import java.util.Scanner;
public class StartToRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leeftijd;
        int hartslagRust;
        int soortTraining;
        int hartslagMax;
        double hartslagIdeaal;

        System.out.println("deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.");
        System.out.print("geef je leeftijd: ");
        leeftijd = scanner.nextInt();
        System.out.print("geef je hartslag in rust: ");
        hartslagRust = scanner.nextInt();
        System.out.print("welk soort training wil je doen: " +
                "\n1 : recuperatie training " +
                "\n2 : LSD training (Long Slow Distance " +
                "\n3 : extensieve uithouding " +
                "\n4 : intensieve uithouding " +
                "\n5 : tempo-interval " +
                "\n6 : intensieve interval " +
                "\nmaak je keuze: ");
        soortTraining = scanner.nextInt();

        hartslagMax = 220 - leeftijd;
        System.out.printf("\nje maximale hartslag is %d",hartslagMax);

        if (soortTraining == 1){
            hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * 0.65/10;
            System.out.printf("\nja traint best met een hartslag rond de %.0f",hartslagIdeaal);

        } else if (soortTraining == 2) {
            hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * 0.70/10;
            System.out.printf("\nja traint best met een hartslag rond de %.0f",hartslagIdeaal);

        } else if (soortTraining == 3) {
            hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * 0.75 / 10;
            System.out.printf("\nja traint best met een hartslag rond de %.0f", hartslagIdeaal);
        }else if (soortTraining == 4) {
            hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * 0.85 / 10;
            System.out.printf("\nja traint best met een hartslag rond de %.0f", hartslagIdeaal);
        }else if (soortTraining == 5) {
            hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * 0.90 / 10;
            System.out.printf("\nja traint best met een hartslag rond de %.0f", hartslagIdeaal);
        }else if (soortTraining == 6) {
            hartslagIdeaal = hartslagRust + (hartslagMax - hartslagRust) * 0.95 / 10;
            System.out.printf("\nja traint best met een hartslag rond de %.0f", hartslagIdeaal);
        } else {
            System.out.println("training zit niet in de lijst.");
        }


        scanner.close();
    }
}
