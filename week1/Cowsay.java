package week1;
import java.util.Scanner;
public class Cowsay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zin;
        int lengte;
        System.out.print("geef een zin: ");
        zin = scanner.nextLine();
        lengte = zin.length();

        String lijn = "*".repeat(lengte + 4);

        System.out.println(lijn);
        System.out.println(zin);
        System.out.println(lijn);
        System.out.println("     \\   ^__^");
        System.out.println("      \\  (oo)\\_______");
        System.out.println("         (__)\\       )\\/\\");
        System.out.println("          U ||----w |");
        System.out.println("            ||      ||");


    }
}
