package oefening1;


import java.util.Comparator;

public class GamerComparable implements Comparator<Gamer> {
    public int compare(Gamer gamer1,Gamer gamer2) {
        return gamer1.getScore() - gamer2.getScore();
    }
}
