package ModelBouwClub;

import java.util.Objects;

public class Member {
    private String name;
    private long number;

    public Member(String name,long number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return getNumber() == member.getNumber() && Objects.equals(getName(), member.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
