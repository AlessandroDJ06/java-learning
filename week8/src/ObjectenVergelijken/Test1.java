package ObjectenVergelijken;

public class Test1 {
    public static void main(String[] args) {
        Student student1 = new Student("Kris", 1234);
        Student student2 = new Student("Kris", 1234);
        if (student1 == student2) {
            System.out.println("De studenten zijn gelijk");
        } else {
            System.out.println("De studenten zijn niet gelijk");
        }
    }
}
