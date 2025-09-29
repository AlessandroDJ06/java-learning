package week3;
import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."," " };

        System.out.println("Geef een woord");
        String input = scanner.nextLine();
        String word = "";
        char letter;
        int[] locaties = new int[input.length()];

        for (int i = 0;i < input.length();i++){
            letter = input.charAt(i);
            switch (letter){
                case 'a' -> locaties[i] = 0;
                case 'b' -> locaties[i] = 1;
                case 'c' -> locaties[i] = 2;
                case 'd' -> locaties[i] = 3;
                case 'e' -> locaties[i] = 4;
                case 'f' -> locaties[i] = 5;
                case 'g' -> locaties[i] = 6;
                case 'h' -> locaties[i] = 7;
                case 'i' -> locaties[i] = 8;
                case 'j' -> locaties[i] = 9;
                case 'k' -> locaties[i] = 10;
                case 'l' -> locaties[i] = 11;
                case 'm' -> locaties[i] = 12;
                case 'n' -> locaties[i] = 13;
                case 'o' -> locaties[i] = 14;
                case 'p' -> locaties[i] = 15;
                case 'q' -> locaties[i] = 16;
                case 'r' -> locaties[i] = 17;
                case 's' -> locaties[i] = 18;
                case 't' -> locaties[i] = 19;
                case 'u' -> locaties[i] = 20;
                case 'v' -> locaties[i] = 21;
                case 'w' -> locaties[i] = 22;
                case 'x' -> locaties[i] = 23;
                case 'y' -> locaties[i] = 24;
                case 'z' -> locaties[i] = 25;
                default -> locaties[i] = 26;

            }

        }
        for(int j = 0;j < input.length();j++){
            word += " "+morse[locaties[j]];
        }

        System.out.printf("%s ", word);





    }
}
