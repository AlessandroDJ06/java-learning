package week3;
import java.util.Calendar;


public class DagVanDeWeek {
    public static void main(String[] args) {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);


        switch (dayOfWeek){
            case 1:
                System.out.println("het is zondag!");
                break;
            case 2:
                System.out.println("het is maandag!");
                break;
            case 3:
                System.out.println("het is dinsdag!");
                break;
            case 4:
                System.out.println("het is woensdag!");
                break;
            case 5:
                System.out.println("het is donderdag!");
                break;
            case 6:
                System.out.println("het is vrijdag!");
                break;
            case 7:
                System.out.println("het is zaterdag!");
                break;
        }

    }
}
