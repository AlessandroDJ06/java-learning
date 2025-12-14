package Winkelmandje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Movie extends Item{
    private String title;
    private List<String> actors;

    public Movie(String id, double price,String title,String actor){
        super(id, price);
        this.title = title;
        this.actors = new ArrayList<>();
        this.actors.add(actor);
    }
    @Override
    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void addActor(String actor){
        actors.add(actor);
    }

    @Override
    public String toString() {
        Iterator<String> its = actors.iterator();
        StringBuilder sb = new StringBuilder();
        while(its.hasNext()){
            String actors = its.next();

            if (its.hasNext()){
                sb.append(actors).append(", ");
            } else {
                sb.append(actors);
            }
        }
        return super.getId() + "\"" + title + "\"" + ", (" + sb + ')';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Movie movie)) return false;
        return Objects.equals(getTitle(), movie.getTitle()) && Objects.equals(getActors(), movie.getActors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getActors());
    }
}
