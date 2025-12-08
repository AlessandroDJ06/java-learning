package Transportmiddelen;

public class TeVoet extends MeansOfTransport{

    public TeVoet(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int)(distance*10)/super.getSpeed(); i++) {
            sb.append("stap-");
        }
        sb.append("stap");
        return sb.toString() ;
    }
}
