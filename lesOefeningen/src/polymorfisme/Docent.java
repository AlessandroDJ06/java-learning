package polymorfisme;

public class Docent extends Persoon {
    private int stamnummer;


    public Docent(String name,int stamnummer){
        super(name);
        this.stamnummer = stamnummer;
    }

    public int getStamnummer() {
        return stamnummer;
    }
}
