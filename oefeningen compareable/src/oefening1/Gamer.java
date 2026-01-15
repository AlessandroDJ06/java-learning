package oefening1;

public class Gamer {
    private String naam;
    private int score;

    public Gamer(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {return String.format("naam : %s , score : %d",naam,score);
    }


}
