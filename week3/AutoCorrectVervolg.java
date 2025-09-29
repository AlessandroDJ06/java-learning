package week3;
import java.util.Scanner;
import java.util.Arrays;

public class AutoCorrectVervolg {


    public static int afstandBepalen(String eersteWoord, String tweedeWoord) {
        int afstand = 0;

        int lengteEerste = eersteWoord.length();
        int lengteTweede = tweedeWoord.length();
        int minLengte = Math.min(lengteEerste, lengteTweede);


        for (int i = 0; i < minLengte; i++) {
            afstand += Math.abs(eersteWoord.toUpperCase().charAt(i) - tweedeWoord.toUpperCase().charAt(i));
        }


        if (lengteEerste > minLengte) {
            for (int i = minLengte; i < lengteEerste; i++) {
                afstand += eersteWoord.toUpperCase().charAt(i);
            }
        } else if (lengteTweede > minLengte) {
            for (int i = minLengte; i < lengteTweede; i++) {
                afstand += tweedeWoord.toUpperCase().charAt(i);
            }
        }

        return afstand;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] woordenLijst = {
                "appel","fiets","computer","tafel","regen","berg",
                "vliegtuig","boek","water","stoel","lamp","auto",
                "hond","kat","bloem","ijs","school","zee","vriend","telefoon"
        };

        System.out.print("Geef een woord: ");
        String input = scanner.nextLine();

        int minAfstand = Integer.MAX_VALUE;
        String correctie = "";
        int[] afstanden = new int[woordenLijst.length];

        for (int i = 0; i < woordenLijst.length; i++) {
            afstanden[i] = afstandBepalen(input, woordenLijst[i]);
            if (afstanden[i] < minAfstand) {
                minAfstand = afstanden[i];
                correctie = woordenLijst[i];
            }
        }

        System.out.printf("bedoelde je %s?\n", correctie);
    }
}
