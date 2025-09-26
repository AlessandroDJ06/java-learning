package week2;
import java.util.Scanner;

public class Onleesbarecode {
    public static void main(String[] args) {
        String message;
        Scanner scanner = new Scanner(System.in);
        System.out.print("geef een string die geencrypteerd moet worden: ");
        message = scanner.nextLine();
        System.out.println(encrypting(message));
        System.out.println("decrypt is " + decrypting(encrypting(message)));

        scanner.close();

    }
    static String encrypting(String message){
        int lengteMessage = message.length();
        int[] encryptedMessage = new int[lengteMessage];

        for (int i = 0; i < lengteMessage;i++){
            encryptedMessage[i] = message.toLowerCase().charAt(i) + 5;
        }
        message = "";
        for (int i = 0; i < lengteMessage; i++){
            message = message + (char)encryptedMessage[i];
        }
        return message;

    }

    static String decrypting(String message){
        int lengteMessage = message.length();
        int[] encryptedMessage = new int[lengteMessage];

        for (int i = 0; i < lengteMessage;i++){
            encryptedMessage[i] = message.toLowerCase().charAt(i) - 5;
        }
        message = "";
        for (int i = 0; i < lengteMessage; i++){
            message = message + (char)encryptedMessage[i];
        }
        return message;
    }
}
