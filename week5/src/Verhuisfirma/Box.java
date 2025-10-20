package Verhuisfirma;

public class Box {
    private String type;
    private double length,width,height,area,volume,tape;

    public Box(String type,double length,double width,double height){
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(String type){
        this.type = type;
        switch (type){
            case "Type1" -> {
                this.height = 50;
                this.width = 50;
                this.length = 100;
            }
            case "Type2" -> {
                this.height = 25;
                this.width = 25;
                this.length = 50;
            }
            case "Type3" -> {
                this.height = 12.5;
                this.width = 12.5;
                this.length = 25;
            }
            default ->{
                this.length = -1;
                this.width = -1;
                this.height = -1;
                System.out.printf("Fout! Het type %s bestaat niet!\n",type);
            }
        }
    }

    public double groundArea(){
        this.area = this.width * this.length;
        return this.area;
    }

    public double volume(){
        this.volume = this.width * this.length * this.height;
        return this.volume;
    }

    public double tapeLength(){
        this.tape = this.length*2 + this.height*2;
        return this.tape;
    }

    public String toString(){
        return "Doos van type " + this.type + ": \n" +
                "   " + this.length + " * " + this.height + " * " + this.width
                +"\n   Oppervlakte: " + groundArea()
                +"\n   Volume: " + volume()
                +"\n   tape lengte: " + tapeLength();
    }

}
