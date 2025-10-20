package Verhuisfirma;

public class Main {
    public static void main(String[] args) {
        Box box = new Box("Type4", 100, 20, 30);
        System.out.println(box);
        box = new Box("Type1");
        System.out.println(box);
        box = new Box("onbekend type");
        System.out.println(box);
    }
}
