package ModelBouwClub;

public class BoardMember extends Member {
    private String function;

    public BoardMember(String name,long number,String function){
        super(name,number);
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    @Override
    public String toString() {
        return "BoardMember{" +
                "function='" + function + '\'' +
                '}' + super.toString();
    }
}
