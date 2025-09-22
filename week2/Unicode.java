package week2;
import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zin;
        int i = 0;
        char huidigeChar;
        int codeVanHuidigeChar;
        System.out.print("geef een zin: ");
        zin = scanner.nextLine();
        int lengte = zin.length();

        while(i < lengte){
            huidigeChar = zin.charAt(i);
            codeVanHuidigeChar = huidigeChar;
            System.out.printf("\n %c heeft een codepoint gelijk aan %d ",huidigeChar,codeVanHuidigeChar);
            i++;
        }

        scanner.close();
    }


}
