package week3;
import java.util.Scanner;

public class Sinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amplitude;
        int periode;
        String spatie = " ";
        String ster = "*";
        System.out.print("Wat is de periode: ");
        periode = scanner.nextInt();
        System.out.print("Wat is de amplitude: ");
        amplitude = scanner.nextInt();




        for (int i = 0; i < (periode*3);i++){
            int positie = (int)(Math.sin(i * 2 * Math.PI / periode) * amplitude + amplitude);
            System.out.println(spatie.repeat(positie)+ster);

        }

    }
}
