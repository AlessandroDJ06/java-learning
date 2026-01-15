package oefening1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Gamer[] gamers = {new Gamer("Gamer1",100),new Gamer("Gamer2",125),new Gamer("Gamer3",120)};
        ArrayList<Gamer> lijst = new ArrayList<>(Arrays.asList(gamers));
        System.out.println("voor sortering");
        for (Gamer i : lijst){
            System.out.println(i);
        }
        lijst.sort(new GamerComparable());
        System.out.println("na sortering");
        for (Gamer i : lijst){
            System.out.println(i);
        }
    }

}
