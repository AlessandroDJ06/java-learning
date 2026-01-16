import java.util.Objects;

abstract class SmartDevice implements Controllable {
    private String id;
    private String room;
    private DeviceType type;
    private boolean on;

    public SmartDevice(String id,String room,DeviceType type){
        this.id = id;
        this.room = room;
        this.type = type;
        this.on = (type.equals(DeviceType.ALARM) || type.equals(DeviceType.LIGHT));
    }


    @Override
    public boolean isOn(){
        return on;
    }

    @Override
    public void turnOn(){
        this.on = true;
    }

    @Override
    public void turnOff(){
        this.on = false;
    }

    public String getRoom() {
        return room;
    }

    public String getId() {
        return id;
    }

    abstract double getAverageEnergyUsage();

    public String toString(){
        return String.format("%s: %s at %s: %s",id,type.toString(),room,(on)? "ON":"OFF");
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SmartDevice that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
