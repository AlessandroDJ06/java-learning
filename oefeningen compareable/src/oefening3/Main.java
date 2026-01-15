package oefening3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] s = {new Student("Alessandro","De Jongh"),new Student("bert","jansens"),new Student("pieter","De Jongh")};
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(s));

        System.out.println("VOOR SORTERING");
        for (Student st :students) {
            System.out.println(st);
        }

        students.sort(new StudentComperatorAchternaam().thenComparing(new StudentComperatorVoornaam()));

        System.out.println("na SORTERING");
        for (Student st :students) {
            System.out.println(st);
        }
    }
}
