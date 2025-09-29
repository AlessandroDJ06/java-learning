package week3;
import java.util.Scanner;

public class Kerstbomen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breedte;
        System.out.println("Geef de breedte de van kerstboom (oneven getal in bereik 13..29):");
        breedte = scanner.nextInt();
        double midden = breedte/2 + 0.5;
        String spatie = " ";
        String ster = "*";
        int afstand = breedte - (int)midden;
        System.out.println(spatie.repeat(afstand+1)+ster.repeat(1));


        for (int i = 0;i < afstand ;i++){

            System.out.println(spatie.repeat(afstand-i)+ster.repeat(i+1)+"*"+ster.repeat(i+1));


        }
        for (int i = 0;i < 4;i++){
            System.out.println(spatie.repeat(afstand)+ster.repeat(3));
        }

    }
}
