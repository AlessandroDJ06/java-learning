package Contacten;

public class PhoneNumber {
    private String number;
    private Kind kind;

    public PhoneNumber(Kind kind, String number){
        this.kind = kind;
        this.number = number;
    }

    public Kind getKind(){
        return this.kind;
    }

    public String getNumber(){
        return this.number;
    }

    public String toString(){
        return this.kind +" "+ this.number;
    }
}
