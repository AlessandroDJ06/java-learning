package Kotbaas;

public class Student {
    private String name;
    private String streetNr;
    private String city;
    private int postalCode;


    public Student(String name,String streetNr,String city,int postalCode){
        this.name = name;
        this.streetNr = streetNr;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public String getStreetNr() {
        return this.streetNr;
    }

    public String getCity() {
        return this.city;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    @Override
    public String toString() {
        return this.name +", "+ this.streetNr + ", " + this.postalCode + " " +this.city;
    }
}
