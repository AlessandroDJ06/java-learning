package week2;
import java.util.Scanner;

public class Autocorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eersteWoord;
        String tweedeWoord;
        int langsteWoord;
        int afstand = 0;

        System.out.print("Geef een woord: ");
        eersteWoord = scanner.next();
        int lengteEersteWoord = eersteWoord.length();

        System.out.print("Geef nog een woord: ");
        tweedeWoord = scanner.next();
        int lengteTweedeWoord = tweedeWoord.length();

        if (Math.min(lengteEersteWoord,lengteTweedeWoord) == lengteTweedeWoord){
            langsteWoord = lengteEersteWoord;
        }else {
            langsteWoord = lengteTweedeWoord;
        }

        int[] codePointsTweedeWoord = new int[langsteWoord];
        int[] codePointsEersteWoord = new int[langsteWoord];
        int[] som = new int[langsteWoord];

        for (int i = 0; i < lengteEersteWoord; i++){
            codePointsEersteWoord[i] = eersteWoord.toUpperCase().charAt(i);

        }
        for (int i = 0; i < lengteTweedeWoord; i++){
            codePointsTweedeWoord[i] = tweedeWoord.toUpperCase().charAt(i);

        }
        for (int i = 0; i < langsteWoord; i++){
            som[i] = codePointsEersteWoord[i] - codePointsTweedeWoord[i];
        }
        for (int i = 0; i < langsteWoord; i++){
            afstand += som[i];
        }
        System.out.printf("De afstand tussen \"%s\" en \"%s\" is %d ",eersteWoord,tweedeWoord,Math.abs(afstand));



    }
}
