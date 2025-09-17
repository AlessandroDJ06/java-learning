package week1.src;

import java.util.Scanner;

public class SommerenUitbreiding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double getal;
        double som = 0;
        double count = 0;
        boolean running = true;
        double gemiddelde = 0;
        String opnieuw;
        System.out.print("geef een getal (stop met 0) : ");
        getal = scanner.nextDouble();

        while (running) {
            if (getal != 0){
                count++;
                som += getal;
                System.out.print("geef een getal (stop met 0) : ");
                getal = scanner.nextDouble();
                gemiddelde = (som/count);
            } else {
                System.out.printf("De som van deze getallen is %.1f. \n je hebt %.0f getallen gegeven \nHet gemiddelde is %.1f\nEinde progamma!", som, count,gemiddelde);
                System.out.println("Wil je nog een keer opnieuw tellen? (J/N) : ");
                opnieuw = (scanner.next()).toUpperCase();

                if (opnieuw.equals("J")){
                    count = 0;
                    som = 0;
                    System.out.println("Oke! , daar gaan we.");
                    System.out.print("geef een getal (stop met 0) : ");
                    getal = scanner.nextDouble();
                } else {
                    System.out.println("Oke! tot de volgende keer.");
                    running = false;
                }
            }


        }

        System.out.printf("De som van deze getallen is %.1f. \nje hebt %.0f getallen gegeven \nHet gemiddelde is %.1f\nEinde progamma!", som, count,gemiddelde);

        scanner.close();
    }
}
