package Leeftijd;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Wapenstilstand {
    public static void main(String[] args) {
        LocalDate wapenstilstand = LocalDate.of(1918,11,11);

        System.out.println("Wapenstilstand (11 november 1918) viel op een " + wapenstilstand.getDayOfWeek());

        System.out.println("in deze jaren valt wapenstilstand op zondag");

        for (int i = 1980; i < 2041; i++ ){
            if (LocalDate.of(i,11,11).getDayOfWeek() == DayOfWeek.SUNDAY){
                System.out.print(i + " ");
            }
        }
    }
}
