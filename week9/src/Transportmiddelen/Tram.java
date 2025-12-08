package Transportmiddelen;

public class Tram extends MeansOfTransport{

    public Tram(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int)(distance*10)/super.getSpeed(); i++) {
            sb.append("ting-");
        }
        sb.append("ting");
        return sb.toString() ;
    }
}
