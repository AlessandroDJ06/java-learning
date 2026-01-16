public enum DeviceType {
    ALARM("ALARM"),
    LIGHT("LIGHT"),
    SENSOR("SENSOR"),
    THERMOSTAT("THERMOSTAT");

    private String name;

    DeviceType(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

}
