package week3;
import java.util.Scanner;
public class Dobbelsteen {
    static int[] rolDobbelsteen(int aantalKeer){
        int enen = 0;
        int tweeen = 0;
        int drieeen = 0;
        int vieren = 0;
        int vijfen = 0;
        int zessen = 0;
        for (int i = 0; i < aantalKeer; i++){
            int random = (int)(Math.random()*6+1);
            switch(random){
                case 1 -> enen ++;
                case 2 -> tweeen ++;
                case 3 -> drieeen ++;
                case 4 -> vieren ++;
                case 5 -> vijfen ++;
                case 6 -> zessen ++;

            }

        }
        int[] aantal = {enen,tweeen,drieeen,vieren,vijfen,zessen};
        return aantal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantalkeer;

        System.out.print("geef het aantalkeer: ");
        aantalkeer = scanner.nextInt();
        int[] output = rolDobbelsteen(aantalkeer);

        for (int i = 0;i <= 5;i++){
            switch(i){
                case 0 -> System.out.printf("\nhet aantal enen : %d",output[0]);
                case 1 -> System.out.printf("\nhet aantal tweeen : %d",output[1]);
                case 2 -> System.out.printf("\nhet aantal drieen : %d",output[2]);
                case 3 -> System.out.printf("\nhet aantal vieren : %d",output[3]);
                case 4 -> System.out.printf("\nhet aantal vijfen : %d",output[4]);
                case 5 -> System.out.printf("\nhet aantal zesen : %d",output[5]);
                default -> System.out.println("probleem");
            }
        }


    }
}
