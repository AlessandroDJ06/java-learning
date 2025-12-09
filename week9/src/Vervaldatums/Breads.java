package Vervaldatums;

import java.time.LocalDate;

public class Breads {
    private final int MAX_AMOUNT_OF_BREADS = 1000;
    private Bread[] breads;
    private int amount;
    private int nextNumber;

    public Breads(){
        this.breads = new Bread[MAX_AMOUNT_OF_BREADS];
        this.amount = 0;
        this.nextNumber = 1000;
    }

    public void addBread(Variety variety, LocalDate expirationDate){
        Bread bread = new Bread(nextNumber,variety,expirationDate);
        if (amount < MAX_AMOUNT_OF_BREADS){
            breads[amount] = bread;
            amount++;
        }
        nextNumber++;
    }

    public void printBreads(){
        for (int i = 0; i < amount; i++) {
            System.out.println(breads[i]);
        }
    }

    public void printExpired(){
        System.out.println();
        System.out.println("Broden die morgen vervallen:");
        for (int i = 0; i < amount; i++){
            if (LocalDate.now().plusDays(1).equals(breads[i].getExpirationDate()) ){
                System.out.println(breads[i]);
            }
        }

    }
}
