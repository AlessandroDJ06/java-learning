package ExtraUitdaging;
import  java.util.Scanner;

public class Palindroom {
    public static boolean palindroom(String input){
        boolean isPalindroom = true;
        for (int i = 0;i < input.length()/2;i++){
            if (input.charAt(i) == input.charAt(input.length()-1-i)){
                isPalindroom = true;
            } else {
                isPalindroom = false;
            }
        }
        return isPalindroom;

    }
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        input = scanner.nextLine();

        if (palindroom(input)){
            System.out.printf("%s is een palindroom!",input);
        } else {
            System.out.printf("%s is geen palindroom!",input);
        }
    }
}
