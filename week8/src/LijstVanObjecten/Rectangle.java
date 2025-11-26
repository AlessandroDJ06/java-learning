package LijstVanObjecten;

import java.util.Objects;

public class Rectangle {
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String toString(){
        return String.format("Rechthoek met lengte %d en breedte %d.",this.length,this.height);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle rectangle)) return false;
        return getHeight() == rectangle.getHeight() && getLength() == rectangle.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getLength());
    }
}
