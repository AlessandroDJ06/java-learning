package Kaartspelletjes2;

public enum Suit {
    SPADES("spades"),
    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts");

    private final String name;

    Suit(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }


}
