package Aardrijkskunde;

public enum Continent {
    NORTH_AMERICA(24256000, 470),
    SOUTH_AMERICA(17819000, 331),
    EUROPE(10530750, 728),
    ASIA(44579000, 3604),
    AFRICA(30665000, 654.5),
    AUSTRALIA(8535117, 29.5),
    ANTARCTICA(13209000, 0);

    private long opp;
    private double population;

    Continent(long opp,double population){
        this.opp = opp;
        this.population = population;
    }

    public int populationDensity(){
        return (int) (population*1000000/opp);
    }

    public String toString(){
        return name() + "(pop.density " + populationDensity() + ")";
    }

}
