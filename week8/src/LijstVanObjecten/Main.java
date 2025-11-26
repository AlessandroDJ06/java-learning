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
        list.add(new Rectangle(10, 20));
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        if (list.get("Hallo") != -1) {
            System.out.println("De string werd gevonden");
        } else {
            System.out.println("De string werd niet gevonden");
        }
        if (list.get(new int[]{1, 2, 3}) != -1) {
            System.out.println("De array werd gevonden");
        } else {
            System.out.println("De array werd niet gevonden");
        }
        if (list.get(new Rectangle(10, 20)) != -1) {
            System.out.println("De rechthoek werd gevonden");
        } else {
            System.out.println("De rechthoek werd niet gevonden");
        }
    }
}
