package Kaartspelletjes2;

public enum CardValue {
    ACE(1,"aas"),
    TWO(2,"twee"),
    THREE(3,"drie"),
    FOUR(4,"vier"),
    FIVE(5,"vijf"),
    SIX(6,"zes"),
    SEVEN(7,"zeven"),
    EIGHT(8,"acht"),
    NINE(9,"negen"),
    TEN(10,"tien"),
    JACK(10,"boer"),
    QUEEN(10,"koningin"),
    KING(10,"koning");


    private int value;
    private String name;

    CardValue(int value,String name){
        this.value = value;
        this.name = name;
    }

    public int getValue(){
        return value;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + " " + value ;
    }


}
