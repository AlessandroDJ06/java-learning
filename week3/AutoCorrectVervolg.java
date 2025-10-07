package week3;
import java.util.Scanner;


public class AutoCorrectVervolg {


    public static int afstandBepalen(String eersteWoord, String tweedeWoord) {
        int afstand = 0;

        int lengteEerste = eersteWoord.length();
        int lengteTweede = tweedeWoord.length();
        int minLengte = Math.min(lengteEerste, lengteTweede);


        for (int i = 0; i < minLengte; i++) {
            afstand += Math.abs(eersteWoord.toUpperCase().charAt(i) - tweedeWoord.toUpperCase().charAt(i));
        }


        if (lengteEerste > minLengte) {
            for (int i = minLengte; i < lengteEerste; i++) {
                afstand += eersteWoord.toUpperCase().charAt(i);
            }
        } else if (lengteTweede > minLengte) {
            for (int i = minLengte; i < lengteTweede; i++) {
                afstand += tweedeWoord.toUpperCase().charAt(i);
            }
        }

        return afstand;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] woordenLijst = {"bier", "water", "kebab", "hamburger", "fiets", "auto", "huis", "boom", "computer", "boek", "stoel", "tafel", "deur", "raam",
                "lamp", "telefoon", "water", "lucht", "zon", "maan", "ster", "neger", "wind", "berg",
                "zee", "strand", "bloem", "gras", "dier", "kat", "hond", "paard", "vogel", "vis",
                "mens", "kind", "vriend", "school", "werk", "spel", "muziek", "film", "theater", "schip",
                "brug", "straat", "plein", "winkel", "markt", "stad", "dorp", "land", "wereld", "taal",
                "woord", "zin", "boek", "blad", "bladzijde", "schrift", "pen", "potlood", "gum", "papier",
                "computer", "programma", "applicatie", "code", "website", "internet", "server", "database",
                "netwerk", "bestand", "map", "schijf", "scherm", "beeld", "kleur", "vorm", "lijn", "vlak",
                "cirkel", "vierkant", "driehoek", "punt", "hoek", "kant", "zijde", "breedte", "lengte", "hoogte",
                "gewicht", "maat", "getal", "nummer", "tijd", "uur", "minuut", "seconde", "dag", "week",
                "maand", "jaar", "seizoen", "voorjaar", "zomer", "herfst", "winter", "morgen", "avond", "nacht",
                "eten", "drinken", "brood", "kaas", "melk", "water", "koffie", "thee", "fruit", "appel",
                "banaan", "peer", "sinaasappel", "druif", "citroen", "groente", "wortel", "tomaat", "sla",
                "komkommer", "aardappel", "rijst", "pasta", "vlees", "vis", "ei", "soep", "salade", "taart",
                "koek", "ijs", "chocolade", "snoep", "suiker", "zout", "peper", "olie", "boter", "azijn","nazi"};


        System.out.print("Geef een woord: ");
        String input = scanner.nextLine();

        int minAfstand = Integer.MAX_VALUE;
        String correctie = "";
        int[] afstanden = new int[woordenLijst.length];

        for (int i = 0; i < woordenLijst.length; i++) {
            afstanden[i] = afstandBepalen(input, woordenLijst[i]);
            if (afstanden[i] < minAfstand) {
                minAfstand = afstanden[i];
                correctie = woordenLijst[i];
            }
        }

        System.out.printf("bedoelde je %s?\n", correctie);
    }
}
