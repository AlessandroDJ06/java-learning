package F1MENTIONED;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class F1Pilot {
    private String nationality;
    private String name;
    private int numberOfTitles;
    private Set<Integer> seasons;

    public F1Pilot(String nationality,String name,int numberOfTitles){
        this.nationality = nationality;
        this.name = name;
        this.numberOfTitles = numberOfTitles;
        this.seasons = new HashSet<>();
    }

    public void addSeason(int jaar){
        seasons.add(jaar);
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTitles() {
        return numberOfTitles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = seasons.iterator();
        while (it.hasNext()){
            Integer jaar = it.next();
            sb.append(" ").append(jaar);
            if (it.hasNext()){
                sb.append(",");
            }
        }
        return String.format("%-20s%-20s%5d[%s]",nationality,name,numberOfTitles,sb);
    }
}
