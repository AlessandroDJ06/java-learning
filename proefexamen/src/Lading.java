package proefexamen.src;

public abstract class Lading {
    private String omschrijving;
    private double basisGewicht;

    public Lading(String omschrijving,double basisGewicht){
        this.omschrijving = omschrijving;
        this.basisGewicht = basisGewicht;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getBasisGewicht() {
        return basisGewicht;
    }

    public String toString(){
        return String.format("omschrijving : %s \nbasisgewicht : %f",this.omschrijving,this.basisGewicht);
    }
}
