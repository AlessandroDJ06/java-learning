package week4;
import java.util.Random;
import java.util.Scanner;
public class Dobbelsteen {
    private int zijden;

    public int getZijden() {
        return zijden;
    }
    public void setZijden(int zijden){
        this.zijden = zijden;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Dobbelsteen dobbelsteen = new Dobbelsteen();
        int zijden;
        System.out.print("geef het aantal zijden: ");
        zijden = scanner.nextInt();
        dobbelsteen.setZijden(zijden);
        scanner.nextLine();

        for (int i = 0; i < 5 ;i++){
            System.out.print("druk op <enter> om te rollen: ");
            scanner.nextLine();
            System.out.println(random.nextInt(1,dobbelsteen.getZijden()));
        }
        System.out.println("klaar");

    }
}
