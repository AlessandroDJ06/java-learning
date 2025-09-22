package week1;
import java.util.Scanner;

public class begroeting {
    public static void main(String[] args) {
        String naam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("wat is je naam: ");
        naam = scanner.next();
        System.out.print("welkom " + naam +"!");
    }
}
