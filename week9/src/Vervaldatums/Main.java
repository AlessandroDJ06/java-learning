package Vervaldatums;
import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Breads breads = new Breads();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            breads.addBread(Variety.values()[random.nextInt(Variety.values().length)], LocalDate.now().plusDays(random.nextInt(1,3)));
        }

        breads.printBreads();
        breads.printExpired();


    }
}
