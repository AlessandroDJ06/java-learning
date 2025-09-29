package week3;
import java.util.Scanner;

public class Konijnen {
    public static int fibonachi(int aantalMaanden){
        int eersteGetal = 1;
        int tweedeGetal = 1;
        int derdeGetal;

        for(int i=aantalMaanden; i>2;i--){
            derdeGetal = eersteGetal + tweedeGetal;
            eersteGetal = tweedeGetal;
            tweedeGetal = derdeGetal;
        }
        return tweedeGetal;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantalMaanden;

        System.out.print("Aantal maanden: ");
        aantalMaanden = scanner.nextInt();

        System.out.printf("na %d heb je %d konijnen",aantalMaanden,fibonachi(aantalMaanden));

    }
}
