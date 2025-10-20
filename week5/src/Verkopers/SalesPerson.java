package Verkopers;

public class SalesPerson {
    private String name;
    private double revenue;

    public SalesPerson(String name,double revenue){
        this.name = name;
        this.revenue = revenue;
    }

    public boolean generatesMoreRevenueThan(SalesPerson salesPerson){
        return this.revenue > salesPerson.revenue;
    }

    @Override
    public String toString() {
        return this.name + " met een omzet van €" +this.revenue;
    }
}
