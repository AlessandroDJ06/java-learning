package week1;
import java.util.Scanner;
public class Reeksen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aantalGetallen;
        double startWaarde;
        double stapWaarde;

        System.out.print("Hoeveel getallen wil je afdrukken? ");
        aantalGetallen = scanner.nextInt();
        System.out.print("met welke waarde wil je starten? ");
        startWaarde = scanner.nextDouble();
        System.out.print("met welke waarde wil je verhogen? ");
        stapWaarde = scanner.nextDouble();

        System.out.printf("%.0f ",startWaarde);
        aantalGetallen --;
        while (aantalGetallen != 0){
            startWaarde += stapWaarde;
            System.out.printf(" %.0f ",startWaarde);
            aantalGetallen --;
        }
    }
}
