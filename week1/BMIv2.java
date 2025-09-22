package week1;
import java.util.Scanner;
public class BMIv2 {
    public static void main(String[] args) {
        double gewicht;
        double lengte;
        double bmi;

        Scanner input = new Scanner(System.in);
        System.out.println("beste patient , dit progamma berekent je BMI");
        System.out.print("wat is je lengte: ");
        lengte = input.nextDouble();
        System.out.print("wat is je gewicht: ");
        gewicht = input.nextDouble();
        bmi = (gewicht/(lengte*lengte));
        System.out.printf("je bmi is %f ",bmi);

        if (bmi < 18){
            System.out.println("\nje hebt dus ondergewicht.");
        } else if ((bmi >= 18) && (bmi < 25)) {
            System.out.println("\nbmi is inorde.");
        } else if ((bmi >= 25) && (bmi < 30)) {
            System.out.println("\nje hebt overgewicht.");
        } else {
            System.out.println("\nje hebt obesitas.");
        }
    }
}
