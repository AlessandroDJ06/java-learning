package oefening3;

import java.util.Comparator;

public class StudentComperatorAchternaam implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAchternaam().compareTo(o2.getAchternaam());
    }
}
