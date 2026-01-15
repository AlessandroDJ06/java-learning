package proefexamen.src;

import java.util.ArrayList;
import java.util.List;

public class Vrachtwagen implements Transporteur {
    private List<Lading> ladingen;
    private final double MAX_GEWICHT = 2000;
    private final int MAX_ITEMS = 10;

    public Vrachtwagen(){
        this.ladingen = new ArrayList<>();
    }

    public double totalWeight(){
        double totaalGewicht = 0;
        for (Lading lading : ladingen) {
            totaalGewicht += lading.getTotaleMassa();
        }
        return totaalGewicht;
    }

    @Override
    public boolean isVol() {
        if (ladingen.size() == MAX_ITEMS || totalWeight() == MAX_GEWICHT){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void laadItem(Lading lading){
        if (isVol()) {
            System.out.println("Vrachtwagen is vol!");
        } else {
            ladingen.add(lading);
        }
    }

    public Lading getZwaarsteLading(){
        if (ladingen.isEmpty()) {
            return null;
        }
        Lading zwaarste = ladingen.getFirst();
        for (int i = 1; i < ladingen.size() ; i++){
            if (ladingen.get(i).getTotaleMassa() > zwaarste.getTotaleMassa()){
                zwaarste = ladingen.get(i);
            }
        }
        return zwaarste;
    }

    public void printManifest(){
        StringBuilder manifest = new StringBuilder("=== MANIFEST ===");

        for (int i = 0 ; i < ladingen.size() ; i++){
            String type = (ladingen.get(i) instanceof Pakket)? "Pakket" : "Container";
            System.out.printf("%d. %s : %s",i,type,ladingen.get(i));
            System.out.println();
        }
        System.out.println("==================");
        System.out.printf("Totaal gewicht vrachtwagen : %.1f kg" , totalWeight());
    }
}
