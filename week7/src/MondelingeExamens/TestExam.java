package MondelingeExamens;
import java.util.Scanner;


public class TestExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Schedule planner = new Schedule();

        System.out.print("Wanneer start het examen? ");
        Time start = new Time(scanner.nextLine());

        System.out.print("hoeveel minuten per examen? ");
        int minutenPerExamen = scanner.nextInt();

        System.out.print("hoeveel studenten? ");
        int aantalStudenten = scanner.nextInt();

        planner.createSchedule(aantalStudenten,minutenPerExamen,start);

        System.out.println("Je schema is: ");
        planner.printSchedule();


    }
}
