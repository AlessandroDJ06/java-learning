import java.util.Scanner;
public class Bewerkingen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double Getal1;
        double Getal2;
        int Operator;

        System.out.print("geef een eerste getal: ");
        Getal1 = scanner.nextDouble();

        System.out.print("geef een tweede getal: ");
        Getal2 = scanner.nextDouble();

        System.out.print("kies een bewerking: \n1 optellen \n2 aftrekken \n3 vermenigvuldigen \n4 delen \nJouw keuze: ");
        Operator = scanner.nextInt();


        if (Operator == 1){
            System.out.print(Getal1 + " + " + Getal2 + " = " + (Getal1+Getal2));
        } else if (Operator == 2) {
            System.out.print(Getal1 + " - " + Getal2 + " = " + (Getal1-Getal2));

        } else if (Operator == 3) {
            System.out.print(Getal1 + " * " + Getal2 + " = " + (Getal1*Getal2));

        } else if (Operator == 4) {
            if (Getal2 == 0){
                System.out.print("je kan niet delen door 0");
            }else {
                System.out.print(Getal1 + " / " + Getal2 + " = " + (Getal1/Getal2));
            }


        } else {
            System.out.print("operator zit ni in de gegeven opties");
        }


        scanner.close();

    }
}
