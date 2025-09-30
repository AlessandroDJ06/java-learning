package week3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class UitdagingWeek3 {
    static int[] rolDobbelsteen(){
        int enen = 0;
        int tweeen = 0;
        int drieeen = 0;
        int vieren = 0;
        int vijfen = 0;
        int zessen = 0;

        for (int i = 0; i < 1 ; i++){
            switch((int)(Math.random()*6+1)){
                case 1 -> enen ++;
                case 2 -> tweeen ++;
                case 3 -> drieeen ++;
                case 4 -> vieren ++;
                case 5 -> vijfen ++;
                case 6 -> zessen ++;

            }

        }
        return new int[] {enen,tweeen,drieeen,vieren,vijfen,zessen};

    }

    static int beurtSpeler(){
        Scanner scanner = new Scanner(System.in);
        String beurtStoppen = "ja";
        int totaleScoreSpeler = 0;
        int totaalBeurtSpeler = 0;
        System.out.println("het is jou beurt! ");
        while(!beurtStoppen.equals("nee")){

            int [] rol = rolDobbelsteen();
            System.out.println(Arrays.toString(rol));
            if (rol[5] != 0){
                totaalBeurtSpeler = 0;
                System.out.printf("Je gooide een 6! dat betekent dat je score deze beurt 0 is en je totaal blijft %d",totaleScoreSpeler);
                beurtStoppen = "nee";
            } else {
                for (int i=0; i < 6;i++){
                    totaalBeurtSpeler += (rol[i]*(i+1));
                }
                System.out.printf("wil je nog een keer rollen? je zit nu op een score van %d in deze beurt en %d in totaal? : ",totaalBeurtSpeler,(totaalBeurtSpeler+totaleScoreSpeler));
                beurtStoppen = scanner.nextLine();
            }
        }
        return totaalBeurtSpeler;
    }
    static int beurtComputer(){
        Random random = new Random();
        int totaalBeurtComputer = 0;
        int rolAantal = random.nextInt(1,12);
        int [] rol = rolDobbelsteen();
        String stop = "no";
        while (stop.equals("no")){
            for (int n = 0; n < rolAantal;n++){
                if (rol[5] != 0){
                    stop = "yes";
                } else {
                    for (int i=0; i < 6;i++){
                        totaalBeurtComputer += (rol[i]*(i+1));
                    }
                    stop = "yes";
                }
            }
        }
        System.out.printf("\nDe computer gooide %d deze beurt.",totaalBeurtComputer);
        return totaalBeurtComputer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totaalScoreSpeler = 0;
        int totaalScoreComputer = 0;
        int speler;
        int computer;

        System.out.print("Wie begint er? jij of de computer(s/c): ");
        String wieBegint = scanner.nextLine();

        while (totaalScoreComputer < 101 || totaalScoreSpeler <  101){
            if (wieBegint.equals("s")){
                speler = beurtSpeler();
                totaalScoreSpeler += speler;
                System.out.println("de totale score van de speler is nu: " + totaalScoreSpeler);
                computer = beurtComputer();
                totaalScoreComputer += computer;
                System.out.println("de totale score van de computer is nu: "+ totaalScoreComputer);
            } else if (wieBegint.equals("c")) {
                computer = beurtComputer();
                totaalScoreComputer += computer;
                System.out.println("de totale score van de computer is nu: "+ totaalScoreComputer);
                speler = beurtSpeler();
                totaalScoreSpeler += speler;
                System.out.println("de totale score van de speler is nu: " + totaalScoreSpeler);
            } else {
                System.out.print("je optie zat niet in de keuze mogelijkheden geef een nieuwe keuze in opties c en s: ");
                wieBegint= scanner.nextLine();
            }


        }

        if (totaalScoreComputer > 101){
            System.out.println("De computer wint! ");
        } else if (totaalScoreSpeler > 101) {
            System.out.println("De speler wint! ");

        }


    }
}
