package FlexibeleLijst;

public class Main {
    public static void main(String[] args) {
        List list = new List(5);
        for(int i=0; i<6; i++) {
            boolean success = list.add(i*i);
            System.out.println(i + ": success = " + success);
            System.out.println("aantal elementen is: " + list.size());
        }
        System.out.println();
        for(int i=0; i<6; i++) {
            int element = list.get(i);
            System.out.println("element " + i + " is: " + element);
        }
        // gevorderd
        list.remove(3);
        System.out.println();
        for(int i=0; i<list.size(); i++) {
            int element = list.get(i);
            System.out.println("element " + i + " is: " + element);
        }
    }
}
