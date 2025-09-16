import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        int eersteGetal;
        int tweedeGetal;
        int derdeGetal;
        Scanner scanner = new Scanner(System.in);
        System.out.print("geef eerste getal: ");
        eersteGetal = scanner.nextInt();
        System.out.print("geef een tweede getal: ");
        tweedeGetal = scanner.nextInt();
        System.out.print("geef derdegetal: ");
        derdeGetal = scanner.nextInt();
        System.out.print("uitkomst is : "+ (eersteGetal * tweedeGetal * derdeGetal));
    }
}

