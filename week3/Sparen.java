package week3;
import java.util.Scanner;

public class Sparen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bedrag;
        double percentage;
        double percentageVanBedrag;

        System.out.print("geef het bedrag: ");
        bedrag = scanner.nextDouble();
        System.out.print("geef het percentage: ");
        percentage = (scanner.nextDouble())/100;

        for (int i = 0; i < 10;i++){
            percentageVanBedrag = bedrag * percentage;
            bedrag = percentageVanBedrag + bedrag;
            System.out.printf("\nbedrag na jaar %d: %f ",i,bedrag);
        }

    }
}