package Vervaldatums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bread {
    private int number;
    private Variety variety;
    private LocalDate expirationDate;

    public Bread(int number,Variety variety,LocalDate expirationDate){
        this.number = number;
        this.variety = variety;
        this.expirationDate = expirationDate;
    }

    public int getNumber() {
        return number;
    }

    public Variety getVariety() {
        return variety;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return number + " " + variety + " " + expirationDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
