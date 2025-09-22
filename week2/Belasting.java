package week2;
import java.util.Scanner;

public class Belasting {
    public static void main(String[] args) {
        int btwPercentage,opties;
        double bedrag,inclusief,exclusief;



        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het BTW percentage: ");
        btwPercentage = scanner.nextInt();
        System.out.print("Geef het bedrag in €: ");
        bedrag = scanner.nextDouble();
        System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
        opties = scanner.nextInt();

        if(opties == 1){
            inclusief = bedrag * (1 + (float)btwPercentage/100);
            System.out.print(bedrag + " + " + btwPercentage + " BTW " + " = " + inclusief);

        } else if (opties == 2) {
            exclusief = bedrag / (1 + (float)btwPercentage/100);
            System.out.print(bedrag + " + " + btwPercentage + " BTW " + " = " + exclusief);
        }else {
            System.out.print("Foutive keuze! ");
        }
    }
}
