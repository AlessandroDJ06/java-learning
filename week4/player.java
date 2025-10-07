package week4;

public class player {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) return;
        this.score = score;
    }
    public static void main(String[] args) {
        player speler1 = new player();
        player speler2 = new player();
        player speler3 = new player();

        speler1.setName("Hasti");
        speler2.setName("jonas");
        speler3.setName("Bogdan");

        speler1.setScore(1020);
        speler2.setScore(610);
        speler3.setScore(460);

        System.out.println("HIGHSCORES");
        System.out.println("----------");
        System.out.println(speler1.getName() + " " + speler1.getScore());
        System.out.println(speler2.getName() + " " + speler2.getScore());
        System.out.println(speler3.getName() + " " + speler3.getScore());


    }
}
