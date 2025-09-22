package week1;

import java.util.Scanner;
public class Vakantie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double UitgavenPersoon1;
        double UitgavenPersoon2;
        double UitgavenPersoon3;
        double totaal;
        double verschilTotaalP1;
        double verschilTotaalP2;
        double verschilTotaalP3;

        System.out.print("hoeveel heeft persoon 1 uitgegeven: ");
        UitgavenPersoon1 = scanner.nextDouble();

        System.out.print("hoeveel heeft persoon 2 uitgegeven: ");

        UitgavenPersoon2 = scanner.nextDouble();

        System.out.print("hoeveel heeft persoon 3 uitgegeven: ");

        UitgavenPersoon3 = scanner.nextDouble();
        totaal = UitgavenPersoon1 + UitgavenPersoon2 + UitgavenPersoon3;

        System.out.println("het totaal dat is uitgegeven is: " + totaal + " elk persoon betaald dus : " + (totaal / 3));

        verschilTotaalP1 = (totaal / 3) - UitgavenPersoon1;
        verschilTotaalP2 = (totaal / 3) - UitgavenPersoon2;
        verschilTotaalP3 = (totaal / 3) - UitgavenPersoon3;

        if ((verschilTotaalP1 <= 0) && (verschilTotaalP2 <= 0) && (verschilTotaalP3 >= 0)) {
            System.out.println("persoon 3 moet " + Math.abs(verschilTotaalP1) + " euro aan persoon 1 en " + Math.abs(verschilTotaalP2) + " euro aan persoon 2");
        } else if ((verschilTotaalP1 <= 0) && (verschilTotaalP2 >= 0) && (verschilTotaalP3 <= 0)) {
            System.out.println("persoon 2 moet " + Math.abs(verschilTotaalP1) + " euro aan persoon 1 en " + Math.abs(verschilTotaalP3) + " euro aan persoon 3");
        } else if ((verschilTotaalP1 >= 0) && (verschilTotaalP2 <= 0) && (verschilTotaalP3 <= 0)) {
            System.out.println("persoon 1 moet " + Math.abs(verschilTotaalP2) + " euro aan persoon 2 en " + Math.abs(verschilTotaalP3) + " euro aan persoon 3");
        } else if ((verschilTotaalP1 <= 0) && (verschilTotaalP2 >= 0) && (verschilTotaalP3 >= 0)) {
            System.out.println("persoon 2 moet " + Math.abs(verschilTotaalP2) + "euro betalen en persoon 3 moet " + Math.abs(verschilTotaalP3) + " euro betalen aan persoon 1");
        } else if ((verschilTotaalP1 >= 0) && (verschilTotaalP2 <= 0) && (verschilTotaalP3 >= 0)) {
            System.out.println("persoon 1 moet " + Math.abs(verschilTotaalP1) + "euro betalen en persoon 3 moet " + Math.abs(verschilTotaalP3) + " euro betalen aan persoon 2");
        } else if ((verschilTotaalP1 >= 0) && (verschilTotaalP2 >= 0) && (verschilTotaalP3 <= 0)) {
            System.out.println("persoon 1 moet " + Math.abs(verschilTotaalP1) + "euro betalen en persoon 2 moet " + Math.abs(verschilTotaalP2) + " euro betalen aan persoon 3");
        }


    }
}