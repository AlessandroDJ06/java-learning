package oefening3;

import java.util.Comparator;
public class StudentComperatorVoornaam implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getVoornaam().compareTo(o2.getVoornaam()) ;
    }
}
