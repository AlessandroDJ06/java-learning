package Transportmiddelen;

public class Fiets extends MeansOfTransport{

    public Fiets(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int)(distance*10)/super.getSpeed(); i++) {
            sb.append("iepe-");
        }
        sb.append("iepe");
        return sb.toString() ;
    }

}
