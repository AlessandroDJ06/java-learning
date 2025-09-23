package week2;
import java.util.Scanner;
import java.util.Random;
public class UitdagingWeek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startAantal = 21;
        int wieStart;


        System.out.print("**Welkom bij nimb!**\nwie begint er? jij of de computer (computer 1 speler 2 ): ");
        wieStart = scanner.nextInt();
        if (wieStart == 1) {
            System.out.println("Oke! jij begint!");
            while (startAantal > 0) {
                startAantal -= speler(startAantal);
                if (startAantal <= 0){
                    System.out.println("De computer is gewonnen!");
                }else {
                    System.out.print("nu is het aan de computer!");
                    startAantal -= computer();
                    System.out.printf("\nDe stack bevat nu %d lucifers\n",startAantal);

                    if (startAantal <= 0){
                        System.out.println("De speler wint! ");
                    }
                }
            }
        } else {
            System.out.println("Oke! de computer begint! ");
            while (startAantal > 0){
                startAantal -= computer();
                if (startAantal <= 0){
                    System.out.println("De stack is leeg! ");
                    System.out.println("De speler is gewonnen!");
                }else {
                    System.out.printf("\nDe stack bevat nu %d lucifers\n",startAantal);
                    startAantal -= speler(startAantal);

                    if (startAantal <= 0){
                        System.out.println("De Computer wint! ");
                    }
                }

            }

        }
    }
    static int computer(){
        Random random = new Random();
        int computerMove;
        computerMove = random.nextInt(1,4);
        System.out.printf("de computer koos %d",computerMove);
        return computerMove;


    }
    static int speler(int startAantal){
        Scanner scanner = new Scanner(System.in);
        int spelerKeuze;
        System.out.printf("hoeveel lucifers wil je van de stack halen? (1,2 of 3) het aantal dat nu op de stack zit is %d: ",startAantal);
        spelerKeuze = scanner.nextInt();

        while(spelerKeuze < 1 || spelerKeuze > 3){
            System.out.print("je kiest een fout getal, blijf tussen 1 en 3, geef een nieuw getal! ");
            spelerKeuze = scanner.nextInt();
        }
        return spelerKeuze;

    }
}