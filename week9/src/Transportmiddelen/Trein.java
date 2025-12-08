package Transportmiddelen;

public class Trein extends MeansOfTransport{

    public Trein(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int)(distance*10)/super.getSpeed(); i++) {
            sb.append("tuut-");
        }
        sb.append("tuut");
        return sb.toString() ;
    }
}
