public class SmartLight extends SmartDevice{
    private final int ENERGY_FACTOR = 3600;
    private int power;

    public SmartLight(String id,String room,int power){
        super(id,room,DeviceType.LIGHT);
        this.power = power;
    }

    @Override
    public double getAverageEnergyUsage(){
        return power*ENERGY_FACTOR;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", power: %d",power);
    }
}
