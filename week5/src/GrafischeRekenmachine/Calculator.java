package GrafischeRekenmachine;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double minxwaarde,maxxwaarde;
        int curve,positie;
        String spatie = " ",ster = "*";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wat is de minimum x-waarde: ");
        minxwaarde = scanner.nextDouble();
        System.out.print("Wat is de maximum x-waarde: ");
        maxxwaarde = scanner.nextDouble();
        System.out.print("welke curve wil je tekenen\n1 = sinus\n2 = cosinus hyperbolicus\n3 = wortel\nJouw keuze: ");
        curve = scanner.nextInt();

        while(curve > 3 || curve < 1){
            System.out.println("geef een juiste optie");
            curve = scanner.nextInt();
        }

        double stap = (maxxwaarde - minxwaarde) / 20;

        switch (curve) {
            case 1 -> {
                for (int i = 0; i < 20; i++) {
                    double x = minxwaarde + i * stap;
                    positie = (int)(10 * Math.sin(x) + 10);
                    System.out.println(spatie.repeat(positie) + ster);
                }
            }
            case 2 -> {
                for (int i = 0; i < 20; i++) {
                    double x = minxwaarde + i * stap;
                    positie = (int)(Math.cosh(x) / 2);
                    System.out.println(spatie.repeat(Math.min(positie, 50)) + ster);
                }
            }
            case 3 -> {
                for (int i = 0; i < 20; i++) {
                    double x = minxwaarde + i * stap;
                    if (x >= 0) {
                        positie = (int)(Math.sqrt(10 * x));
                        System.out.println(spatie.repeat(Math.min(positie, 50)) + ster);
                    }
                }
            }
        }





    }
}
