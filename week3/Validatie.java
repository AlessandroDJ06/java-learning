package week3;
import java.util.Scanner;

public class Validatie {
    public static int readNumber(int input){
        Scanner scanner = new Scanner(System.in);
        while(input < 0 || input > 100 || (input > 50 && input % 2 != 0)){
            if(input < 0){
                System.out.print("getal mag niet negatief zijn! Geef een nieuw getal: ");
                input = scanner.nextInt();
            } else if (input > 100) {
                System.out.print("getal groter dan 100! geef een nieuw getal: ");
                input = scanner.nextInt();
            }else {
                System.out.print("getal groter dan 50 marr niet deelbaar door 2! Geef een nieuw getal: ");
                input = scanner.nextInt();
            }
        }
        return input;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AANTALITERATIES = 5;
        int counter = 0;
        int totaal = 0;
        int input;

        while(counter < AANTALITERATIES){
            System.out.print("geef een getal: ");
            input = scanner.nextInt();
            totaal += readNumber(input);
            counter++;
        }
        double gemiddelde = (double)totaal/AANTALITERATIES;
        System.out.printf("\nhet gemiddelde van deze getallen is: %.2f",gemiddelde);




    }
}
