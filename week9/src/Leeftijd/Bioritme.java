package Leeftijd;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bioritme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int dag = scanner.nextInt();

        System.out.print("Geef je geboortemaand: ");
        int maand = scanner.nextInt();

        System.out.print("Geef je geboortejaar: ");
        int jaar = scanner.nextInt();

        LocalDate geboortejaar = LocalDate.of(jaar,maand,dag);

        long daysOld = ChronoUnit.DAYS.between(geboortejaar,LocalDate.now());

        double[] ritmes = {Math.abs(Math.sin((double)daysOld / 23 * 2 * Math.PI)),Math.abs(Math.sin((double)daysOld / 28 * 2 * Math.PI)),Math.abs(Math.sin((double)daysOld / 33 * 2 * Math.PI))};
        String[] ritmeNames = {"fysical","emotional","intellectual"};

        System.out.println(daysOld);
        System.out.println("Je bioritmes zijn: ");

        for (int i = 0; i < ritmes.length; i++) {
            if (ritmes[i] >= 0 && ritmes[i] < 0.2){
                System.out.println(String.format("- %s: kritieke waarde",ritmeNames[i]));
            } else if (ritmes[i] >= 0.2 && ritmes[i] < 0.5) {
                System.out.println(String.format("- %s: ok",ritmeNames[i]));
            }  else if (ritmes[i] >= 0.2 && ritmes[i] < 0.8) {
            System.out.println(String.format("- %s: goed",ritmeNames[i]));
            } else {
                System.out.println(String.format("- %s: topconditie",ritmeNames[i]));
            }

        }


    }
}
