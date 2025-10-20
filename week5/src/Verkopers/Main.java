package Verkopers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de omzet van de eerste verkoper: ");
        double revenue = scanner.nextDouble();
        SalesPerson viktor = new SalesPerson("Viktor", revenue);

        System.out.print("Geef de omzet van de tweede verkoper: ");
        revenue = scanner.nextDouble();
        SalesPerson tine = new SalesPerson("Tine", revenue);

        System.out.print("Geef de omzet van de derde verkoper: ");
        revenue = scanner.nextDouble();
        SalesPerson kubra = new SalesPerson("Kubra", revenue);

        if (viktor.generatesMoreRevenueThan(tine) && viktor.generatesMoreRevenueThan(kubra)){
            System.out.printf("De beste verkoper is %s ",viktor);
        } else if (tine.generatesMoreRevenueThan(viktor) && tine.generatesMoreRevenueThan(kubra)) {
            System.out.printf("De beste verkoper is %s",tine);
        } else {
            System.out.printf("De beste verkoper is %s",kubra);
        }

    }
}
