package week1;
import java.util.Scanner;
public class tafels2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gevraagdetafel;
        int count = 0;
        int fouten = 0;
        int gok;
        int echteScore;
        String doorgaan = "j";



        while (doorgaan.equals("j")){
            System.out.print("van welk getal wil je de tafel weten?: ");
            gevraagdetafel = scanner.nextInt();
            while(count != 11){
                System.out.println("wat is " + count + " * " + gevraagdetafel + " = ...");
                gok = scanner.nextInt();
                echteScore = count * gevraagdetafel;
                while(gok != echteScore){
                    System.out.println("dat is helaas fout... probeer opnieuw :) " +  count + " * " + gevraagdetafel + " = ...");
                    gok = scanner.nextInt();
                    fouten++;
                }
                System.out.println("dat is correct!");
                count++;
            }
            count = 0;
            System.out.println("je maakte " + fouten + " fouten op de tafel van " + gevraagdetafel + ".");
            fouten = 0;
            System.out.print("wil je een andere tafel hebben?(j/n): ");
            doorgaan = scanner.next();

        }


        scanner.close();
    }
}
