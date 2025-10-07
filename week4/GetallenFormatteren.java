package week4;

import java.util.Scanner;

public class GetallenFormatteren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("geef een getal: ");
        int getal = scanner.nextInt();

        StringBuilder sb = new StringBuilder(String.valueOf(getal));
        StringBuilder formatted = new StringBuilder();

        int count = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            formatted.append(sb.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                formatted.append(' ');
            }
        }
        formatted.reverse();
        System.out.println(formatted);
    }
}
