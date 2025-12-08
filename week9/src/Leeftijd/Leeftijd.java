package Leeftijd;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int dag = scanner.nextInt();

        System.out.print("Geef je geboortemaand: ");
        int maand = scanner.nextInt();

        System.out.print("Geef je geboortejaar: ");
        int jaar = scanner.nextInt();

        LocalDate geboortejaar = LocalDate.of(jaar,maand,dag);

        LocalDate nu = LocalDate.now();

        Period age = Period.between(geboortejaar,nu);

        System.out.println("je bent nu " + age.getYears() + " jaren " + age.getMonths() + "maanden" + age.getDays() +" dagen oud." );

    }
}
