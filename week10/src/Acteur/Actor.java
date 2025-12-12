package Acteur;

import java.util.Objects;

public class Actor implements Comparable<Actor> {
    private String name;
    private int birthYear;

    public Actor(String name,int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Actor actor)) return false;
        return getBirthYear() == actor.getBirthYear() && Objects.equals(getName(), actor.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthYear());
    }

    @Override
    public String toString() {
        return birthYear + " " + name;
    }

    public int compareTo(Actor actor) {
        int result = Integer.compare(this.birthYear,actor.birthYear);

        if (result != 0){
            return result;
        }

        return this.name.compareTo(actor.name);
    }
}
