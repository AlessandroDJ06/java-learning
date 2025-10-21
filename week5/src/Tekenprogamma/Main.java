package Tekenprogamma;

public class Main {
    static final int CYAN = 1;
    static final int MAGENTA = 2;
    static final int YELLOW = 3;

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3.5, 6, CYAN);
        Rectangle rectangle2 = new Rectangle(3.1, 7.3, MAGENTA);
        Circle circle1 = new Circle(5, YELLOW);
        Circle circle2 = new Circle(2, MAGENTA);

        // print de vier figuren

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(circle1);
        System.out.println(circle2);

        double totalArea = rectangle1.area()+rectangle2.area()+ circle1.area()+ circle2.area();
        double cyanArea = rectangle1.area();
        double magentaArea = rectangle2.area();
        double yellowArea = circle2.area();
        // bepaal de oppervlakte per kleur door de kleur van iedere figuur te bekijken en op te tellen
        System.out.printf("Totale oppervlakte is: %f%n", totalArea);
        System.out.printf("Totale oppervlakte cyaan is: %f%n", cyanArea);
        System.out.printf("Totale oppervlakte magenta is: %f%n", magentaArea);
        System.out.printf("Totale oppervlakte geel is: %f%n", yellowArea);
    }
}
