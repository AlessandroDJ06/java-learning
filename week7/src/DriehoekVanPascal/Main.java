package DriehoekVanPascal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_ROW = 12;
        int[][] driehoek = new int[MAX_ROW][MAX_ROW];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef het aantal rijen: ");
        int aantalRijen = scanner.nextInt();

         driehoek[0][0] = 1;
         driehoek[1][0] = 1;
         driehoek[1][1] = 1;

        for (int i = 1 ; i < aantalRijen ; i++){
            for (int j = 2 ; j <= i ; j++){
                driehoek[i][j] = driehoek[i - 1][j - 1] + driehoek[i - 1][j];
            }

        }

        for (int i = 1 ; i < aantalRijen ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(driehoek[i][j] + " ");
            }
            System.out.println();
        }
    }
}
