package proefexamen.src;

public class Container extends Lading {
    private int inhoudVolume;

    public Container(String omschrijving , double basisgewicht , int inhoudVolume){
        super(omschrijving,basisgewicht);
        this.inhoudVolume = inhoudVolume;
    }

    public double getTotaleMassa(){
        return super.getBasisGewicht() + (this.inhoudVolume * 0.5);
    }

    public String toString(){
        return super.toString() + String.format("inhoudsvolume : %d", this.inhoudVolume);
    }
}
