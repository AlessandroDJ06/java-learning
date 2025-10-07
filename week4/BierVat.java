package week4;

public class BierVat {
    private double capaciteit;
    private double inhoud;

    public void setCapaciteitet(double capaciteit){
        this.capaciteit = capaciteit;
    }

    public double getCapaciteit() {
        return capaciteit;
    }

    public void setInhoud(double inhoud){
        this.inhoud = inhoud;
    }

    public double getInhoud() {
        return inhoud;
    }

    public void vulVolledig(){
        this.inhoud = this.capaciteit;
    }
    public void tap(double aantalLiters){
        this.inhoud -= aantalLiters;
    }
    public double percentageGevuld(){
        return (this.inhoud/this.capaciteit)*100;
    }

    public boolean isVol(){
        boolean vol;
        if (this.inhoud==this.capaciteit){
            vol =  true;
        } else {
            vol =  false;
        }
        return vol;
    }

    public static void main(String[] args) {
        BierVat biervat = new BierVat();
        biervat.capaciteit = 15;
        biervat.vulVolledig();
        System.out.println("percentage = "  +biervat.percentageGevuld());

        if (biervat.isVol()){
            System.out.println("het biervat is vol.");
        } else {
            System.out.println("het biervat is niet vol.");
        }
        biervat.tap(3.75);
        System.out.println("percentage = "  + biervat.percentageGevuld());
        if (biervat.isVol()){
            System.out.println("het biervat is vol.");
        } else {
            System.out.println("het biervat is niet vol.");
        }


    }
}
