package Beeldscherm;

public class Main {
    private static Screen screen;

    public static void point(int xc, int yc, int x, int y) {
        screen.setCharacter(xc + x, yc + y, '*');
        screen.setCharacter(xc - x, yc + y, '*');
        screen.setCharacter(xc + x, yc - y, '*');
        screen.setCharacter(xc - x, yc - y, '*');
        screen.setCharacter(xc + y, yc + x, '*');
        screen.setCharacter(xc - y, yc + x, '*');
        screen.setCharacter(xc + y, yc - x, '*');
        screen.setCharacter(xc - y, yc - x, '*');
    }

    public static void draw(int xc, int yc, int r) {
        int x = 0, y = r;
        int d = 3 - 2 * r;
        point(xc, yc, x, y);
        while (y >= x) {
            x++;
            if (d > 0) {
                y--;
                d = d + 4 * (x - y) + 10;
            } else {
                d = d + 4 * x + 6;
            }
            point(xc, yc, x, y);
        }
    }

    public static void main(String[] args) {
        screen = new Screen();
        screen.clear();
        draw(40, 12, 10);
        screen.print();
    }
}
