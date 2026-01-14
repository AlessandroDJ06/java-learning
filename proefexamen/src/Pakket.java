package proefexamen.src;

public class Pakket extends Lading{
    private boolean isBreekbaar;

    public Pakket(String omschrijving,double gewicht, boolean isBreekbaar ){
        super(omschrijving,gewicht);
        this.isBreekbaar = isBreekbaar;
    }


}
