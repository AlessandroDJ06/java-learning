package Schaken;


public class Main {
    public static void main(String[] args) {
        //TODO make the player class and make the code below function as instructed.
        //TODO Uncomment the code below to test your solution. Do NOT change any code here beyond uncommenting it.
        //Negative age should not be allowed!
        Player player1 = new Player("Sebastiaan", 2993, 0.5f, false);
        //Fixing negative age
        player1.setAge(1993);
        //Win ratio should not be higher than 1!
        Player player2 = new Player("Wim", 1963, 75, false);
        //Fixing win ratio
        player2.setWinRatio(0.73f);

        System.out.println(player1 + " win? " + player1.play());
        System.out.println(player2 + " win? " + player2.play());

        if(player1.play(player2)){
            System.out.println(player1 + " wins!");
        } else {
            System.out.println(player2 + " wins!");
        }

    }
}