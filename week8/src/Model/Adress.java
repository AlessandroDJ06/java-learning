package Model;

public class Adress {
    private String streetNr;
    private String zipCode;

    public Adress(String streetNr,String zipCode){
        this.streetNr = streetNr;
        this.zipCode = zipCode;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.streetNr,this.zipCode);
    }
}
