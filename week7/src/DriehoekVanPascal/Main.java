package DriehoekVanPascal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_ROW = 12;
        int[][] driehoek = new int[MAX_ROW][MAX_ROW];
        Scanner scanner = new Scanner(System.in);
        int aantalRijen;

        do {
            System.out.print("Geef het aantal rijen: ");
            aantalRijen = scanner.nextInt();
        }while(aantalRijen > MAX_ROW);

        for (int i = 0 ; i < aantalRijen ; i++){
            driehoek[i][i] = 1;
            driehoek[i][0] = 1;
            for (int j = 0 ; j <= i ; j++){
                driehoek[i][j] = (j == 0) ? 1:driehoek[i - 1][j - 1] + driehoek[i - 1][j];
            }

        }

        for (int i = 0 ; i < aantalRijen ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(driehoek[i][j] + " ");
            }
            System.out.println();
        }
    }
}
