package week1;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double gewicht;
        double lengte;
        Scanner input = new Scanner(System.in);
        System.out.println("beste patient , dit progamma berekent je BMI:");
        System.out.print("wat is je lengte: ");
        lengte = input.nextDouble();
        System.out.print("wat is je gewicht: ");
        gewicht = input.nextDouble();
        System.out.print("je bmi is " + (gewicht/(lengte*lengte)));
    }
}
