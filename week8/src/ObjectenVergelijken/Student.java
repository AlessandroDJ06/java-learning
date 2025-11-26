package ObjectenVergelijken;

import java.util.Objects;

public class Student {
    private String name;
    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return getNumber() == student.getNumber() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }
}
