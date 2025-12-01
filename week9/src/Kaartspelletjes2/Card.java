package Kaartspelletjes2;

public class Card {
    private Suit suit;
    private CardValue value;

    public Card(Suit suit,CardValue value){
        this.suit = suit;
        this.value = value;
    }

    public Card(){
        this(Suit.DIAMONDS,CardValue.ACE);
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    public String toString(){
        return value.getName() + " " + suit + " ("+ value.getValue()+")";
    }


}
