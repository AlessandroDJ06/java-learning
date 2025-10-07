package week4;
import java.util.Scanner;

public class SpelenMetStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterSpatie = 0;

        System.out.print("geef een zin:");
        String zin = scanner.nextLine();
        String aangepasteZin = zin;
        StringBuilder stringZonderSpaties = new StringBuilder();
        String stringZonderKlinkers= zin;


        System.out.println("er zijn "+ zin.length() + " tekens in deze zin.");
        System.out.println(zin.toUpperCase());
        System.out.println(zin.toLowerCase());
        System.out.println("het eerste karakter is een '"+zin.charAt(0)+"'");
        System.out.println("het laatste karakter is een '"+zin.charAt(zin.length()-1)+"'");

        for (int i = 0 ; i < zin.length(); i++){
            char teken = zin.charAt(i);
            if (teken == ' '){
                counterSpatie++;
            }
        }
        System.out.println("zonder spaties zijn er " + (zin.length()-counterSpatie));
        for (int i = 0; i < zin.length(); i++){
            if (zin.charAt(i) == 'e'){
                aangepasteZin = zin.replace(zin.charAt(i),'_');
            }
        }
        System.out.println(aangepasteZin);

        for (int i = 0; i < zin.length();i++){
            if (zin.charAt(i) != ' '){
                stringZonderSpaties.append(zin.charAt(i));
            }
        }
        System.out.println(stringZonderSpaties);
        System.out.println(stringZonderKlinkers.replaceAll("[aeiouAEIOU]",""));

    }
}
