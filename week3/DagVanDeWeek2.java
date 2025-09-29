package week3;
import java.util.Calendar;


public class DagVanDeWeek2 {
    public static void main(String[] args) {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);


       String dag = switch (dayOfWeek) {
           case 1 -> "zondag";
           case 2 -> "maandag";
           case 3 -> "dinsdag";
           case 4 -> "woensdag";
           case 5 -> "donderdag";
           case 6 -> "vrijdag";
           case 7 -> "zaterdag";
           default -> "onbekend";
       };
        System.out.printf("Het is vandaag %s",dag);

    }
}
