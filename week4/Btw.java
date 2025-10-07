package week4;

public class Btw {
    private int percentage;

    public void setPercentage(int percentage){
        this.percentage = percentage;
    }
    public double voegBtwBij(double bedrag){
        return bedrag+(bedrag*(((double)this.percentage/100)));
    }
    public double neemBtwWeg(double bedrag){
        return bedrag-(bedrag*(((double)this.percentage/100)));
    }

    public static void main(String[] args) {
        Btw btw = new Btw();
        btw.setPercentage(6);
        double bedrag = btw.voegBtwBij(100);
        System.out.println("Het bedrag met BTW is: " + bedrag);
        bedrag = btw.neemBtwWeg(106);
        System.out.println("Het bedrag zonder BTW is: " + bedrag);
    }
}
