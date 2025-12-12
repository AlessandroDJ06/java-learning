package Verjaardagen;

import java.time.Month;
import java.util.Date;

public class Birthday implements Comparable<Birthday> {
    private int day;
    private Month month;

    public Birthday(int day,Month month){
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    @Override
    public String toString() {
        String months = switch (month){
            case JANUARY -> "januari";
            case FEBRUARY -> "februari";
            case MARCH -> "maart";
            case APRIL -> "april";
            case MAY -> "mei";
            case JUNE -> "juni";
            case JULY -> "juli";
            case AUGUST -> "augustus";
            case SEPTEMBER -> "september";
            case OCTOBER -> "oktober";
            case NOVEMBER -> "november";
            case DECEMBER -> "december";
        };
        return day + " " + months;
    }

    @Override
    public int compareTo(Birthday other) {
        int monthCompare = this.month.compareTo(other.month);
        if (monthCompare != 0){
            return monthCompare;
        }

        return Integer.compare(this.day,other.day);
    }
}
