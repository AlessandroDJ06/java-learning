package Transportmiddelen;

public class Bus extends MeansOfTransport{

    public Bus(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double distance){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (int)(distance*10)/super.getSpeed(); i++) {
            sb.append("vroem-");
        }
        sb.append("vroem");
        return sb.toString() ;
    }


}
