package Leeftijd;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class VrijdagDeDertiende {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2029, 12, 31);

        for (int year = start.getYear(); year <= end.getYear(); year++) {
            for (int month = 1; month <= 12; month++) {

                LocalDate date = LocalDate.of(year, month, 13);

                if (!date.isBefore(start) && !date.isAfter(end)) {
                    if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                        System.out.println(date);
                    }
                }
            }
        }
    }
}
