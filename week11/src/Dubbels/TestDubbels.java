package Dubbels;

public class TestDubbels {
    public static void main(String[] args) {
        Dubbels dubbels = new Dubbels(Data.getData());

        System.out.println("Origineel:\n" + dubbels);
        dubbels.verwijderDubbels();
        System.out.println("\nNa verwijderen dubbels:\n" + dubbels);
    }
}
