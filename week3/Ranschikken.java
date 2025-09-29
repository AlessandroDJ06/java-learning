package week3;
import java.util.Scanner;

public class Ranschikken {
    public static int faculteit(int aantalVoorwerpen){
        int aantalMogelijkheden =1;
        for (int i = 2; i <= aantalVoorwerpen; i++){
            aantalMogelijkheden *= i ;
        }

    return aantalMogelijkheden;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantalVoorwerpen;
        System.out.print("hoeveel voorwerpen?: ");
        aantalVoorwerpen = scanner.nextInt();

        System.out.printf("je kan %d voorwerpen op %d verschillende manieren ranschikken.",aantalVoorwerpen,faculteit(aantalVoorwerpen));

    }
}
