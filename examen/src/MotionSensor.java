public class MotionSensor extends SmartDevice{
    private boolean motionDetected;

    public MotionSensor(String id , String room){
        super(id,room,DeviceType.SENSOR);
        this.motionDetected = false;
    }

    public void setMotionDetected(boolean motionDetected) {
        this.motionDetected = motionDetected;
    }

    public boolean isMotionDetected() {
        return motionDetected;
    }

    @Override
    public double getAverageEnergyUsage(){
        return 0.5;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", %s",(motionDetected)? "motion detected":"no motion detected");
    }
}
