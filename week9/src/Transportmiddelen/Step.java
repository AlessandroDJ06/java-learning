package Transportmiddelen;

public class Step extends MeansOfTransport{

    public Step(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int)(distance*10)/super.getSpeed(); i++) {
            sb.append("zzz-");
        }
        sb.append("zzz");
        return sb.toString() ;
    }
}
