package Model;

public class BodyMeasures {
    private double bust;
    private double hips;
    private double waist;

    public BodyMeasures(double bust, double hips, double waist){
        this.bust = bust;
        this.hips = hips;
        this.waist = waist;
    }

    public BodyMeasures(){
        this(90,60,90);
    }

    public double getBust() {
        return bust;
    }

    public double getHips() {
        return hips;
    }

    public double getWaist() {
        return waist;
    }

    public void setBust(double bust) {
        this.bust = bust;
    }

    public void setHips(double hips) {
        this.hips = hips;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    @Override
    public String toString() {
        return String.format("%.2f %.2f %.2f",this.bust,this.waist,this.hips);
    }
}


