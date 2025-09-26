package week2;
import java.util.Scanner;

public class Schrikkeljaar {
    public static void main(String[] args) {
        int jaartal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een jaartal: ");
        jaartal = scanner.nextInt();

        if (((jaartal % 4) == 0) && ((jaartal % 100) != 0 ) || ((jaartal % 400) == 0) ){
            System.out.printf("Het jaar %d is een schrikeljaar.",jaartal);
        } else {
            System.out.printf("Het jaar %d is geen schrikeljaar.",jaartal);
        }
    }
}
