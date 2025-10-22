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

    public static String sorteer(player player1,player player2,player player3) {
        if (player1.getScore() > player2.getScore() && player1.getScore() > player3.getScore()) {
            if (player2.getScore() > player3.getScore()) {
                return player1.getName() + " " + player1.getScore() + "\n" + player2.getName() + " " + player2.getScore() + "\n" + player3.getName() + " " + player3.getScore();
            } else {
                return player1.getName() + " " + player1.getScore() + "\n" + player3.getName() + " " + player3.getScore() + "\n" + player2.getName() + " " + player2.getScore();
            }
        } else if (player2.getScore() > player1.getScore() && player2.getScore() > player3.getScore()) {
            if (player1.getScore() > player3.getScore()) {
                return player2.getName() + " " + player2.getScore() + "\n" + player1.getName() + " " + player1.getScore() + "\n" + player3.getName() + " " + player3.getScore();
            } else {
                return player2.getName() + " " + player2.getScore() + "\n" + player3.getName() + " " + player3.getScore() + "\n" + player1.getName() + " " + player1.getScore();
            }

        }else if (player3.getScore() > player1.getScore() && player3.getScore() > player2.getScore()) {
            if (player1.getScore() > player2.getScore()) {
                return player3.getName() + " " + player3.getScore() + "\n" + player1.getName() + " " + player1.getScore() + "\n" + player2.getName() + " " + player2.getScore();
            } else {
                return player3.getName() + " " + player3.getScore() + "\n" + player2.getName() + " " + player2.getScore() + "\n" + player1.getName() + " " + player1.getScore();
            }

        }else {
            return "";
        }
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
        System.out.println(sorteer(speler1,speler2,speler3));



    }
}
