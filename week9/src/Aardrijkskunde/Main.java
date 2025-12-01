package Aardrijkskunde;
import static Aardrijkskunde.Continent.*;

public class Main {
    public static void main(String[] args) {
        Continent[] continent = {NORTH_AMERICA,SOUTH_AMERICA,EUROPE,ASIA,AFRICA,AUSTRALIA,ANTARCTICA};

        for(Continent co : continent){
            System.out.println(co);
        }
    }
}
