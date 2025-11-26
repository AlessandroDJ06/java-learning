package LijstVanObjecten;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add("Hallo");
        list.add(LocalDate.now());
        list.add(new Random());
        list.add(new int[]{1, 2, 3});
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
