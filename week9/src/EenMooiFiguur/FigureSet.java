package EenMooiFiguur;

public class FigureSet {
    private final Figure[] figures;

    public FigureSet() {
        this.figures = new Figure[10];
        this.figures[0] = new Point("punt");
        this.figures[1] = new Line("lijn1", 10);
        this.figures[2] = new Rectangle("rechthoek1", 10, 20);
        this.figures[3] = new Square("vierkant", 8);
        this.figures[4] = new Cuboid("balk1", 12, 13, 3);
        this.figures[5] = new Sphere("bol", 5);
        this.figures[6] = new Cuboid("balk2", 11, 4, 2);
        this.figures[7] = new Rectangle("rechthoek2", 5, 6);
        this.figures[8] = new Rectangle("rechthoek3", 8, 9);
        this.figures[9] = new Line("lijn2", 3);
    }

    public double totalCircumference() {
        double total=0;
        for (Figure figure: figures){
            if (figure instanceof HasBorder){
                total += ((HasBorder) figure).circumference();
            }
        }

        return total;
    }

    public double totalArea() {
        double total=0;
        for (Figure figure: figures){
            if (figure instanceof HasSurface){
                total += ((HasSurface) figure).area();
            }
        } return total;

    }

    public double totalVolume() {
        double total=0;
        for (Figure figure: figures){
            if (figure instanceof HasVolume){
                total += ((HasVolume) figure).volume();
            }
        }return total;
    }
}