package week3;
import java.util.Scanner;

public class Afronden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bedrag;
        double percentage;
        double percentageVanBedrag;

        System.out.print("geef het bedrag: ");
        bedrag = scanner.nextDouble();
        System.out.print("geef het percentage: ");
        percentage = (scanner.nextDouble())/100;

        for (int i = 1; i < 11;i++){
            percentageVanBedrag = bedrag * percentage;
            bedrag = percentageVanBedrag + bedrag;
            System.out.printf("\nbedrag na jaar %d: %.2f ",i,bedrag);
        }

    }
}