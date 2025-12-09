package Vervaldatums;

public enum Variety {
    WHITE("wit brood"),
    BROWN("bruin brood");

    private final String name;

    Variety(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
