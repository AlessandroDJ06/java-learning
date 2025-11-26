package Model;

public class Main {
    public static void main(String[] args) {
        Model firstModel = new Model("Caroline");
        System.out.println("\nEerste model");
        System.out.println(firstModel);

        Model secondModel = new Model("Veronica", 102, 67, 88);
        secondModel.setAddress(new Adress("Nationalestraat 5", "2000"));
        System.out.println("\nTweede model");
        System.out.println(secondModel);
    }
}
