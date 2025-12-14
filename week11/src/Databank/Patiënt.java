package Databank;

public class Patiënt {
    private int id;
    private String name;
    private int huisartsId;

    public Patiënt(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHuisartsId() {
        return huisartsId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHuisartsId(int huisartsId) {
        this.huisartsId = huisartsId;
    }
}
