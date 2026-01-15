package proefexamen.src;

public class Pakket extends Lading{
    private boolean isBreekbaar;

    public Pakket(String omschrijving,double gewicht, boolean isBreekbaar ){
        super(omschrijving,gewicht);
        this.isBreekbaar = isBreekbaar;
    }

    public double getTotaleMassa(){
        return super.getBasisGewicht();
    }

    public String toString(){
        return super.toString() + ((this.isBreekbaar)? ", breekbaar":" , niet breekbaar");
    }
}
