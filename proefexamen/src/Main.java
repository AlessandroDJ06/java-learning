package proefexamen.src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- DEEL 1: LADINGEN AANMAKEN ---");

        List<Lading> voorraad = new ArrayList<>();

        // 1. We maken gewone, geldige objecten aan (geen try-catch meer nodig)
        Pakket p1 = new Pakket("Boeken", 5.5, false);
        Pakket p2 = new Pakket("Glaswerk", 2.1, true);
        Container c1 = new Container("Elektronica", 500.0, 100);

        // Toevoegen aan onze tijdelijke voorraad
        voorraad.add(p1);
        voorraad.add(p2);
        voorraad.add(c1);

        // Printen om toString() te testen
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(c1);

        System.out.println("\n--- DEEL 2: VRACHTWAGEN & MANIFEST ---");

        Vrachtwagen mijnTruck = new Vrachtwagen();

        // We laden de truck met de spullen uit deel 1
        for (Lading l : voorraad) {
            mijnTruck.laadItem(l);
        }

        // Manifest printen
        mijnTruck.printManifest();

        // Zwaarste lading testen
        Lading zwaarste = mijnTruck.getZwaarsteLading();
        if (zwaarste != null) {
            System.out.println("\nZwaarste lading: " + zwaarste.toString());
        }

        System.out.println("\n--- DEEL 3: DISTRIBUTIECENTRUM (INTERFACE) ---");

        // We maken een lijst met items voor de simulatie
        List<Lading> inkomendeGoederen = new ArrayList<>();

        // Gewoon toevoegen zonder exception checks
        inkomendeGoederen.add(new Pakket("Doos A", 10, false));
        inkomendeGoederen.add(new Pakket("Doos B", 10, false));
        // Deze is heel zwaar (1500 + 100 = 1600kg), waardoor de truck vol zal raken
        inkomendeGoederen.add(new Container("Zware Container", 1500, 200));
        inkomendeGoederen.add(new Pakket("Doos C (Past niet meer)", 10, false));

        // We maken een NIEUWE, lege vrachtwagen
        // Variabele is type Transporteur, object is Vrachtwagen
        Transporteur transporteur = new Vrachtwagen();

        // Laat het distributiecentrum zijn werk doen
        DistributieCentrum.verwerk(transporteur, inkomendeGoederen);

        System.out.println("\nKlaar met testen!");
    }
}