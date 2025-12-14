package Databank;

public class Huisarts {
    private int id;
    private String name;

    public Huisarts(String naam){
        this.name = naam;
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
