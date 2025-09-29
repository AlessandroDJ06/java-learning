package week3;
import java.util.Scanner;

public class Wachtwoorden {
    public static boolean wachtwoordChecker(String input){
        Scanner scanner = new Scanner(System.in);
        int leestekens = 0;
        int kleineLetters = 0;
        int hoofdLetters = 0;
        int cijfers = 0;
        int letterCode;
        char letter;
        boolean goedWachtwoord = false;
        int lengte = input.length();

        while(leestekens == 0 || kleineLetters ==  0 || hoofdLetters == 0 || lengte < 8 || cijfers == 0){
            leestekens = 0;
            kleineLetters = 0;
            hoofdLetters = 0;
            cijfers = 0;
            lengte = input.length();
            for (int i = 0; i < lengte;i++){
                letter = input.charAt(i);
                letterCode = letter;

                if ((letterCode >= 32 && letterCode <= 47) || (letterCode >= 58 && letterCode <= 64) || (letterCode >= 91 && letterCode <= 96) || (letterCode >= 123 && letterCode <= 127)){
                    leestekens++;
                } else if (letterCode >= 48 && letterCode <= 57) {
                    cijfers++;
                } else if (letterCode >= 65 && letterCode <= 90 ) {
                    hoofdLetters++;
                } else if (letterCode >= 97 && letterCode <= 122) {
                    kleineLetters++;
                }

            }

            if (leestekens == 0){
                System.out.print("je wachtwoord moet minstens 1 leesteken bevatten!, geef een nieuw wachtwoord:  ");
                input = scanner.nextLine();
            } else if (kleineLetters == 0) {
                System.out.print("je wachtwoord moet minstens 1 kleine letter hebben! geef een nieuw wachtwoord: ");
                input = scanner.nextLine();
                
            } else if (hoofdLetters == 0) {
                System.out.print("je wachtwoord moet minstens 1 hoofd letter hebben! geef een nieuw wachtwoord: ");
                input = scanner.nextLine();

            } else if (lengte < 8) {
                System.out.print("je wachtwoord moet minstens 8 tekens hebben! geef een nieuw wachtwoord: ");
                input = scanner.nextLine();

            }else if (cijfers == 0) {
                System.out.print("je wachtwoord moet minstens 1 cijfer hebben! geef een nieuw wachtwoord: ");
                input = scanner.nextLine();
            } else {
                goedWachtwoord = true;
            }
        }

        return goedWachtwoord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Geef een nieuw wachtwoord: ");
        input = scanner.nextLine();
        if (wachtwoordChecker(input)){
            System.out.print("je wachtwoord is goedgekeurd! ");
        }


    }
}
