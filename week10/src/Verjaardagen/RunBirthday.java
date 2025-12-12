package Verjaardagen;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RunBirthday {
    public static void main(String[] args) {
        Person[] data = {
                new Person("Jeremy",  new Birthday(16, Month.MAY)),
                new Person("Bo",      new Birthday( 9, Month.DECEMBER)),
                new Person("Evelyne", new Birthday(15, Month.AUGUST)),
                new Person("Jeremy",  new Birthday(23, Month.AUGUST)),
                new Person("Divine",  new Birthday(25, Month.APRIL)),
                new Person("Ayoub",   new Birthday(15, Month.AUGUST)),
                new Person("Jeremy",  new Birthday( 3, Month.AUGUST)),
                new Person("Divine",  new Birthday(10, Month.APRIL))
        };
        List<Person> persons = new ArrayList<Person>(Arrays.asList(data));
        showPersons(persons);
        Collections.sort(persons);
        System.out.println("\nGesorteerd op verjaardag:");
        Collections.sort(persons,(person1,person2) -> person1.getBirthday().compareTo(person2.getBirthday()));
        showPersons(persons);
        System.out.println("\nGesorteerd op naam:");
        Collections.sort(persons, (person1,person2) -> person1.getName().compareTo(person2.getName()));
        showPersons(persons);
    }

    private static void showPersons(List<Person> persons) {
        for (Person person : persons){
            System.out.println(person);
        }
    }

}
