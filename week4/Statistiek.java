package week4;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
public class Statistiek {
    public static void main(String[] args) {
        IntSummaryStatistics stats = new IntSummaryStatistics();
        Scanner scanner = new Scanner(System.in);
        int getal = 0;
        while(getal != -1 ){
            System.out.print("Geef een getal (-1 = stop): ");
            getal = scanner.nextInt();
            stats.accept(getal);
        }



        System.out.println("Gemiddelde: " + stats.getAverage());


    }
}
