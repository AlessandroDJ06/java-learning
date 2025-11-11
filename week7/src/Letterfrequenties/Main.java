package Letterfrequenties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CharacterFrequencies frequencies = new CharacterFrequencies();

        String sentence;
        do {
            System.out.print("Geef een zin: ");
            sentence = keyboard.nextLine();
            frequencies.adaptFrequencies(sentence);
            frequencies.printFrequencies();
        } while (!sentence.equals(""));
    }
}
