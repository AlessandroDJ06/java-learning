package week1;
import java.util.Scanner;

public class bankcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100 ;

        System.out.println("Enter the amount of times commpunded per year: ");
        timesCompound = scanner.nextInt();

        System.out.println("enter # years: ");
        years = scanner.nextInt();

        amount = principal + Math.pow(1 + rate / timesCompound, timesCompound + years);
        System.out.println("the amount after " + years + " is: " + amount);
    }
}
