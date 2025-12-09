package Leeftijd;

import java.time.LocalDate;

public class Ramadan {
    public static void main(String[] args) {
        LocalDate previousRamadan = LocalDate.of(2022,4,2);

        System.out.println("Dit programma schat dat de Ramadan op volgende datums zal starten:");
        for (int i = 2023; i <= 2025; i++) {
            previousRamadan = previousRamadan.plusDays(Math.round(29.53059*12));
            System.out.println(previousRamadan);
        }
    }
}
