package Tekenprogamma;



public class Rectangle extends Main {
    private double width,height;
    private int kleur;


    public Rectangle(double width,double height, int kleur){
        this.width = width;
        this.height = height;
        this.kleur = kleur;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public int getKleur() {
        return kleur;
    }

    public double area(){
        return this.height * this.width;
    }

    public String kleur(){
        return switch (this.kleur){
            case CYAN -> "cyaan";
            case YELLOW -> "geel";
            case MAGENTA -> "magenta";
            default -> "geen kleur";
        };
    }

    @Override
    public String toString() {
        return "rechthoek " + this.height + " x " + this.width + "in kleur " + kleur();
    }
}
