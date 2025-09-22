package week1;
import java.util.Scanner;
public class Middelste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eersteGetal;
        int tweedeGetal ;
        int derdeGetal ;


        System.out.print("geef het eerste getal (1..100) :  ");
        eersteGetal = scanner.nextInt();

        while (eersteGetal < 1 || eersteGetal > 100){
            System.out.print("getal moet tussen 1 en 100 liggen");
            eersteGetal = scanner.nextInt();
        }
        System.out.print("geef het tweede getal (1..100) :  ");
        tweedeGetal = scanner.nextInt();
        while (tweedeGetal < 1 || tweedeGetal > 100){
            System.out.print("getal moet tussen 1 en 100 liggen");
            tweedeGetal = scanner.nextInt();
        }
        System.out.print("geef het derde getal (1..100) :  ");
        derdeGetal = scanner.nextInt();
        while (derdeGetal < 1 || derdeGetal > 100){
            System.out.print("getal moet tussen 1 en 100 liggen");
            derdeGetal = scanner.nextInt();
        }

        if ((eersteGetal > tweedeGetal && tweedeGetal < derdeGetal && eersteGetal < derdeGetal) || (eersteGetal < tweedeGetal && tweedeGetal > derdeGetal && eersteGetal > derdeGetal)){
            System.out.printf("het middelste getal is %d",eersteGetal);
        } else if ((eersteGetal > tweedeGetal && tweedeGetal > derdeGetal && eersteGetal > derdeGetal) || (eersteGetal < tweedeGetal && tweedeGetal < derdeGetal && eersteGetal < derdeGetal)) {
            System.out.printf("het middelste getal is %d",tweedeGetal);

        }else {
            System.out.printf("het middelste getal is %d",derdeGetal);
        }

    }
}
