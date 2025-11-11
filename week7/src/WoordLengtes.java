import java.util.Scanner;

public class WoordLengtes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantalWoorden;
        String kortsteWoord,langsteWoord;

        System.out.print("hoeveel woorden wil je ingeven?: ");
        aantalWoorden = scanner.nextInt();
        scanner.nextLine();

        String[] tabel = new String[aantalWoorden];

        for (int i = 0; i < aantalWoorden; i++){
            System.out.printf("Woord %d : ",i+1);
            tabel[i] = scanner.nextLine();
        }

        kortsteWoord = tabel[0];
        langsteWoord = tabel[0];


        for (String s : tabel) {
            kortsteWoord = (s.length() < kortsteWoord.length()) ? s : kortsteWoord;
            langsteWoord = (s.length() > langsteWoord.length()) ? s : langsteWoord;
        }

        System.out.printf("kortste woord: %s \n",kortsteWoord);
        System.out.printf("langste woord: %s \n",langsteWoord);

    }
}
