package ZoekeEnTellen;
import java.util.Scanner;

public class TestGetallenZoeken {
    public static void main(String[] args) {

        int[] table = {16, 14, 19, 18, 4, 10, 2, 3, 12, 17, 14,
                12, 4, 10, 10, 16, 12, 10, 12, 20};

        Numbers numbers = new Numbers(table);
        System.out.println("Getallen: " + numbers);

        System.out.println("\nGetal " + 12 + " komt " +
                numbers.numberOfTimes(12) + " keer voor.");
        System.out.println("Getal " + 20 + " komt " +
                numbers.numberOfTimes(20) + " keer voor.");
        System.out.println("Getal " + 13 + " komt " +
                numbers.numberOfTimes(13) + " keer voor.\n");

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Welk getal wil je zoeken? (stop met -1): ");
            number = scanner.nextInt();
            if (number >= 0) {
                System.out.printf("Het getal %d komt %svoor in de tabel%n", number, (numbers.isPresent(number)?"":"NIET "));
            }
        } while (number >= 0);
    }
}