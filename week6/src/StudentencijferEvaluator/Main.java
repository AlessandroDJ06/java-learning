package StudentencijferEvaluator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name,doorgaan;
        int id;
        double cijfer;
        do {
            System.out.print("geef de naam van de student: ");
            name = scanner.nextLine();
            System.out.print("Geef het ID van de student: ");
            id = scanner.nextInt();
            System.out.print("Geef het cijfer van de student (0-100): ");
            cijfer = scanner.nextDouble();
            Student student = new Student(name,id,cijfer);

            while (!student.nameCorrect()){
                System.out.print("er zit een fout in de naam , naam mag niet leeg zijn en moet een spatie bevatten, geef een nieuwe: ");
                student.setName(scanner.nextLine());
            }
            while(!student.idCorrect()){
                System.out.print("id moet positief zijn, geef een nieuwe id: ");
                student.setId(scanner.nextInt());
            }
            while(!student.cijferCorrect()){
                System.out.println("cijfer moet positief zijn en kleiner dan 100: ");
                student.setCijfer(scanner.nextDouble());
            }
            System.out.println("resultaten worden berekend...");
            for (int i =3; i > 0;i--){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-".repeat(20));
            System.out.println("StudentInformatie");
            System.out.println("-".repeat(20));

            System.out.printf("Naam: %s\n",student.getName());
            System.out.printf("ID: %d\n",student.getId());
            System.out.printf("Cijfer: %.1f\n",student.getCijfer());
            System.out.printf("Prestatie : %s\n",student.getPrestatieCategorie());
            System.out.println("-".repeat(20));

            scanner.next();
            System.out.print("wil je nog een student invoeren?(ja/nee): ");
            doorgaan = scanner.nextLine();
            while(!doorgaan.equals("ja")&&!doorgaan.equals("nee")){
                System.out.print("optie staat niet in de lijst! geef een nieuwe: ");
                doorgaan = scanner.nextLine();
            }
        }while (doorgaan.equals("ja"));
    }
}
