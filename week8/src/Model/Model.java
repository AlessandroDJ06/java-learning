package Model;

public class Model extends Person{
    private BodyMeasures measures;
    private Adress adress;

    public Model(String name, double bust, double hips, double waist){
        super(name);
        this.measures = new BodyMeasures(bust, hips, waist);
        this.adress = new Adress("Adress","onbekend");
    }

    public Model(String name){
        super(name);
        this.measures = new BodyMeasures();
        this.adress = new Adress("Adress","onbekend");
    }


    public double getBust(){
        return this.measures.getBust();
    }

    public double getHips(){
        return this.measures.getHips();
    }

    public double getWaist(){
        return this.measures.getWaist();
    }

    public Adress getAddress(){
        return this.adress;
    }

    public void setAddress(Adress adress){
        this.adress = adress;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s \n" +
                "Adres: %s \n" +
                "Maten: %s",super.toString(),adress.toString(),measures.toString());
    }
}
