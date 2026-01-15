package proefexamen.src;

import java.util.List;

public class DistributieCentrum {
    public static void verwerk(Transporteur transporteur, List<Lading> binnenkomend) {
        for (Lading l : binnenkomend){
            if (!transporteur.isVol()){
                transporteur.laadItem(l);
                System.out.println("Lading [" + l.getOmschrijving() + "] geladen.");
            } else {
                System.out.println("Transporteur zit vol! [" + l.getOmschrijving() + "] niet geladen.");
                break;
            }
        }
    }
}
