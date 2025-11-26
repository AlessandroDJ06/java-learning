package printer;

public class Main {
    public static void main(String[] args) {
        Sphere head = new Sphere(0, 15, 0, 5);
        Cylinder body = new Cylinder(0, 0, 0, 5, 20);
        Cuboid arm1 = new Cuboid(-6, 0, 0, 2, 15, 2);
        Cuboid arm2 = new Cuboid(6, 0, 0, 2, 15, 2);
        Cube foot1 = new Cube(-3, -20, 0, 2);
        Cube foot2 = new Cube(3, -20, 0, 2);

        double volume = head.volume();
        volume += body.volume();
        volume += arm1.volume();
        volume += arm2.volume();
        volume += foot1.volume();
        volume += foot2.volume();

        System.out.println(head);
        System.out.println(body);
        System.out.println(arm1);
        System.out.println(arm2);
        System.out.println(foot1);
        System.out.println(foot2);

        System.out.printf("%nHet totale volume is: %.2f%n", volume);
    }
}
