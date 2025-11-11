package KaartSpelletjes;
import java.util.Random;

public class Card {
    private String[] suit;
    private String[] value;
    static Random random = new Random();

    public void setSuit(String[] suit){
        this.suit = suit;
    }

    public String[] getSuit(){
        return this.suit;
    }

    public void setValue(String[] value){
        this.value = value;
    }

    public String[] getValue(){
        return this.value;
    }

    public String[] createCards(int aantal){
        String[] cards = new String[aantal];

        for (int i = 0 ; i < aantal; i++){
            cards[i] = this.suit[random.nextInt(0,this.suit.length)] + " " + this.value[random.nextInt(0,this.value.length)];
        }
        return cards;
    }

    public String showCards(String[] cards){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < cards.length;i++){
            sb.append(cards[i]).append("\n");
        }
        return sb.toString();
    }


}
