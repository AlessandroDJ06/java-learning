package Tekenprogamma;



public class Circle extends Main{
    private double radius;
    private int kleur;

    public Circle(double radius,int kleur){
        this.radius = radius;
        this.kleur = kleur;
    }

    public int getKleur() {
        return this.kleur;
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area(){
        return this.radius * Math.PI;
    }

    public String kleur(){
        return switch (this.kleur){
            case CYAN -> "cyaan";
            case YELLOW-> "geel";
            case MAGENTA -> "magenta";
            default -> "geen kleur";
        };
    }

    public String toString() {
        return "Cirkel met straal  " + this.radius + "in kleur " + kleur();
    }


}
