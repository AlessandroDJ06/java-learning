package week2;
import java.util.Scanner;

public class Investeringen {
    public static void main(String[] args) {
        double bedrag, rentpercentage, eindsaldo;
        int aantalJaren;
        String valuta;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wat is je initiële investering: ");
        bedrag = scanner.nextDouble();
        System.out.print("wat is je jaarlijkse rentepercentage (in %) : ");
        rentpercentage = scanner.nextDouble();
        System.out.print("hoeveel jaren wil je het bedrag investeren?: ");
        aantalJaren = scanner.nextInt();
        System.out.print("wat is je valuta?: ");
        valuta = scanner.next();


        eindsaldo = Math.pow(bedrag * (1 + rentpercentage/100 ),aantalJaren);

        System.out.printf("je orginele bedrag was: %.1f " +
                "\nJe rentepercentage was %.1f %% " +
                "\nhet aantal jaren was %d", bedrag,rentpercentage,aantalJaren);
        System.out.printf("je eindbedrag is %.1f %s",eindsaldo,valuta);

    }
}
