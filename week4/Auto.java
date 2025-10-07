package week4;

public class Auto {
    private String merk;
    private String type;
    private int fiscaalVermogen;

    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setFiscaalVermogen(int fiscaalVermogen){
        this.fiscaalVermogen = fiscaalVermogen;
    }

    public int getFiscaalVermogen() {
        return fiscaalVermogen;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public double berekenVerkeersBelasting(){
        return this.fiscaalVermogen*136.8;
    }

    public String toonResultaten(){
        return getMerk() + ' ' + getType() + " met een vermogen van " + getFiscaalVermogen() + "PK heeft een verkeersbelasting van " +  String.format("%.2f",berekenVerkeersBelasting())+ "€";
    }

    public static void main(String[] args) {
        Auto porsche = new Auto();
        Auto renault = new Auto();
        Auto bentley = new Auto();

        porsche.setMerk("Porsche");
        porsche.setFiscaalVermogen(19);
        porsche.setType("911 gt3");
        System.out.println(porsche.toonResultaten());

        renault.setMerk("Renault");
        renault.setType("Clio");
        renault.setFiscaalVermogen(6);
        System.out.println(renault.toonResultaten());

        bentley.setMerk("Bentley");
        bentley.setType("Phantom");
        bentley.setFiscaalVermogen(36);
        System.out.println(bentley.toonResultaten());

    }
}
