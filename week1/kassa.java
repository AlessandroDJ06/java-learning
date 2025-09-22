package week1;
import java.util.Scanner;
public class kassa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double korting;
        int kleinekinderen;
        int kinderen;
        int volwassenen;
        int senioren;
        int totaalbetalendemensen;
        double prijsformule;
        double prijs;
        int aantalmensen;

        System.out.print("Aantal kinderen <1m: ");
        kleinekinderen = scanner.nextInt();
        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        kinderen = scanner.nextInt();
        System.out.print("Aantal volwassenen: ");
        volwassenen = scanner.nextInt();
        System.out.print("Aantal senioren (55+): ");
        senioren = scanner.nextInt();

        totaalbetalendemensen = kinderen + volwassenen + senioren;
        aantalmensen = kinderen + kleinekinderen +  volwassenen + senioren;
        prijsformule = (26*kinderen) + (31*volwassenen) + (15.50*senioren);
        System.out.println("\n*******************************");
        System.out.println("* Welkom in het pretpark! *");
        System.out.println("*******************************");

        if (totaalbetalendemensen >= 10){
            korting = prijsformule * 0.10;
            prijs = prijsformule - korting;
            System.out.printf("*Prijs: %.1fEUR",prijsformule);
            System.out.printf("\n*groepskorting: %.1fEUR",korting);
            System.out.printf("\n*Totaal: %.1fEUR",prijs);
            System.out.println("\n*******************************");


        } else if (senioren >= 2) {
            korting = 13*kinderen;
            prijs = prijsformule-korting;
            System.out.printf("*Prijs: %.1f EUR",prijsformule);
            System.out.printf("\n*Grootouderskorting: %.1fEUR",korting);
            System.out.printf("\n*Totaal: %.1f EUR",prijs);
            System.out.println("\n*******************************");

        }else {
            System.out.printf("*Totaal: %.1f EUR",prijsformule);
            System.out.println("\n*******************************");

        }
        System.out.printf("*totaal aantal mensen: %d *",aantalmensen);
    }
}
