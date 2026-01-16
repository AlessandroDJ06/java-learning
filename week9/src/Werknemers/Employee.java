package Werknemers;

abstract class Employee {
    protected static final double HOURLY_WAGES = 12.5;
    private String name;
    private long nationalNumber;

    public Employee(String name, long nationalNumber){
        this.name = name;
        this.nationalNumber = nationalNumber;
    }

    public double getHOURLY_WAGES() {
        return HOURLY_WAGES;
    }

    public String getName() {
        return name;
    }

    public long getNationalNumber() {
        return nationalNumber;
    }

    abstract double getWages();

    @Override
    public String toString() {
        return String.format("name: %s \nnummer: %d\nLoon: %.2f€",name,nationalNumber,getWages());
    }

}
