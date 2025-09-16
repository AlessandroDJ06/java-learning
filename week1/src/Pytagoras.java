package week1.src;
import java.util.Scanner;

public class Pytagoras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("geef een eerste getal: ");
        a = scanner.nextDouble();
        System.out.print("geef een tweede getal: ");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));

        System.out.println("de schuine zijde is: " + c);

    }
}
