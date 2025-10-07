package ExtraUitdaging;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static int dealer(){
        Random random = new Random();
        int kaarten = random.nextInt(1,10);
        int kaart;
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        kaart = values[kaarten];
        return kaart;
    }
    public static int startGame(){
        return 2*dealer();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speler = startGame();
        int dealer = startGame();
        int balance;
        int inzet;
        String doorgaan = "ja";
        String allIn;
        String moveSpeler;
        System.out.print("geef een startbedrag waarmee je wilt gaan spelen: ");
        balance = scanner.nextInt();
        while(balance != 0 || doorgaan.equals("ja")){
            System.out.printf("hoeveel geld wil je deze ronde inzetten?,je huidige balance is %d: ", balance);
            inzet = scanner.nextInt();
            if (inzet == 0){
                System.out.println("ben je een pussy ofzo? zet geld in!: ");
                inzet = scanner.nextInt();
            } else if (inzet > balance) {
                System.out.println("je inzet is te groot wil je all in gaan of een nieuw bedrag kiezen? (all/new)");
                allIn = scanner.nextLine();
                if (allIn.equals("all")){
                    System.out.println("Oke daar gaan we!");
                    inzet = balance;
                }else {
                    System.out.println("wat is je nieuwe bedrag?: ");
                    inzet = scanner.nextInt();
                }

            }
            System.out.printf("De starthand van de dealer is %d",dealer);
            System.out.printf("\nJou starthand is %d",speler);
            System.out.println("wil je hit , stand , of double?: ");
            moveSpeler = scanner.nextLine();
            while (dealer < 21 || speler < 21 ){
                if (moveSpeler.equals("hit")){
                    speler += dealer();
                    System.out.printf("je hebt nu in totaal %d",speler);
                    if (speler > 21){
                        System.out.println("je bent helaas verloren , probeer nog eens :/");
                        balance -= inzet;
                    } else {
                        System.out.println("wil je nog een keer hit, of stand?");
                        moveSpeler = scanner.nextLine();
                    }

                } else if (moveSpeler.equals("double")){
                    speler += dealer();
                    inzet = inzet*2;
                    System.out.printf("Een risicootje , love it! je inzet is nu %d ! en je totaal is %d",inzet,speler);
                    if (speler > 21){
                        System.out.println("je bent helaas verloren , probeer nog eens :/");
                        balance -= inzet;
                    }

                } else if (moveSpeler.equals("stand")) {
                    System.out.println("veilige speler ik zie het nu al ;)");

                }else {
                    System.out.print("\noptie staat niet in de lijst! probeer nog eens");
                    moveSpeler = scanner.nextLine();
                }

                while (dealer < 17){
                    dealer += dealer();
                }

                if (speler <= 21 && speler > dealer || dealer > 21 ){
                    inzet = 2*inzet;
                    balance += inzet;
                    System.out.printf("PROFICIAT JE WINT!! ,de dealer had %d je hebt %d gewonnen en je balance is %d",dealer, inzet,balance);
                    System.out.print("\nwil je nog eens? (ja/nee)");
                    doorgaan = scanner.nextLine();
                } else {
                    balance -= inzet;
                    System.out.printf("helaas je verliest ,de dealer had %d je hebt %d verloren en je balance is %d",dealer, inzet,balance);
                    System.out.print("\nwil je nog eens? (ja/nee)");
                    doorgaan = scanner.nextLine();
                }

                dealer = startGame();
                speler = startGame();

            }

        }






    }
}

