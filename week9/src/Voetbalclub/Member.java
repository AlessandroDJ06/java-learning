package Voetbalclub;

public class Member {
    private int id;
    private String name;
    private MemberType type;

    public Member(int id,String name,MemberType type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MemberType getType() {
        return type;
    }

    public String type(){
        if (type.equals(MemberType.NORMAL)){
            return "gewoon";
        } else if (type.equals(MemberType.HONOURLY)) {
            return "erelid";
        } else if (type.equals(MemberType.SUPPORTING)) {
            return "supporter";
        } else {
            return "onbekend";
        }
    }

    @Override
    public String toString() {
        return String.format("%5d %-10sSoort: %s",id,name,type());
    }
}
