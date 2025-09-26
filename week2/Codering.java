package week2;
import java.util.Scanner;

public class Codering {
    public static void main(String[] args) {
        String message;
        String encodeOrNot;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een bericht: ");
        message = scanner.nextLine();
        System.out.print("wil je dit encoderen? (j/n) ");
        encodeOrNot = scanner.nextLine();

       while(!encodeOrNot.equals("q")){
           if(encodeOrNot.equals("j")){
               System.out.print("gecodeerd bericht " + encrypting(message));
               System.out.print("\nwil je dit encoderen? (j/n) ");
               encodeOrNot = scanner.nextLine();
           } else if (encodeOrNot.equals("n")){
               System.out.print("gedecodeerd bericht " + decrypting(encrypting(message)));
               System.out.print("\nwil je dit encoderen? (j/n) ");
               encodeOrNot = scanner.nextLine();
           } else {
               System.out.print("\nwil je opnieuw proberen of stoppen?");
               encodeOrNot = scanner.nextLine();
           }
       }


        scanner.close();

    }
    static String encrypting(String message){
        int lengteMessage = message.length();
        int[] encryptedMessage = new int[lengteMessage];

        for (int i = 0; i < lengteMessage;i++){
            int verschuiving = i;
            encryptedMessage[i] = message.toLowerCase().charAt(i) + verschuiving;
        }
        message = "";
        for (int i = 0; i < lengteMessage; i++){
            message += (char)encryptedMessage[i];
        }
        return message;

    }

    static String decrypting(String message){
        int lengteMessage = message.length();
        int[] encryptedMessage = new int[lengteMessage];

        for (int i = 0; i < lengteMessage;i++){
            int verschuiving = i;
            encryptedMessage[i] = message.toLowerCase().charAt(i) - verschuiving;
        }
        message = "";
        for (int i = 0; i < lengteMessage; i++){
            message += (char)encryptedMessage[i];
        }
        return message;
    }
}
