package week1.src;
import java.util.Scanner;
public class Sommeren {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double getal;
        double som = 0;
        System.out.print("geef een getal (stop met 0) : ");
        getal = scanner.nextDouble();

        while (getal != 0){
            som += getal;
            System.out.print("geef een getal (stop met 0) : ");
            getal = scanner.nextDouble();

        }
        System.out.printf("De som van deze getallen is %.1f \nEinde progamma!",som);

        scanner.close();
    }
}
