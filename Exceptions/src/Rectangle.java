public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length,int width){
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public final void setLength(int length) {
        if (length < 0){
            throw new IllegalArgumentException("Lengte moet groter zijn als 0");
        }
        this.length = length;
    }

    public final void setWidth(int width) {
        if (width < 0){
            throw new IllegalArgumentException("Lengte moet groter zijn als 0");
        }
        this.width = width;
    }
}
