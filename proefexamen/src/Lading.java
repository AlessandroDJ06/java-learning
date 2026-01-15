package proefexamen.src;

public abstract class Lading {
    private String omschrijving;
    private double basisGewicht;

    public Lading(String omschrijving,double basisGewicht){
        this.omschrijving = omschrijving;
        if (basisGewicht < 0){
            System.out.println("basisgewicht moet groter zijn dan 0 , wordt op 0 gezet");
            this.basisGewicht = 0;
        } else {
            this.basisGewicht = basisGewicht;
        }
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getBasisGewicht() {
        return basisGewicht;
    }

    abstract double getTotaleMassa();

    public String toString(){
        return String.format("omschrijving : %s (%.2fkg)",this.omschrijving,this.basisGewicht);
    }
}
