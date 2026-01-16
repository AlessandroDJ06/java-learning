import java.time.LocalDateTime;
import java.util.*;

public class SmartHomeController {
    List<SmartDevice> allSmartDevices = new ArrayList<>();

    public void addSmartDevice(SmartDevice device){
        allSmartDevices.add(device);
    }

    public void turnOnAllDevices(){
        for (SmartDevice device : allSmartDevices){
            device.turnOn();
        }
    }

    public void showSortedById(){
        allSmartDevices.sort(new IdComperator());
        for (SmartDevice device : allSmartDevices){
            System.out.println(device);
        }
    }

    public void showRooms(){
        Set<String> rooms = new HashSet<>();
        StringBuilder output = new StringBuilder("All rooms with smart devices in it (no duplicates!): ");
        for (SmartDevice device : allSmartDevices){
            rooms.add(device.getRoom());
        }
        for (String room : rooms) {
            output.append(room).append(" ");
        }
        System.out.println(output);
    }

    public void deviceConsumingMostEnergy(){
        SmartDevice mostEnergy = (allSmartDevices.isEmpty())? null:allSmartDevices.getFirst();
        for (SmartDevice device : allSmartDevices){
            if (device.getAverageEnergyUsage() > mostEnergy.getAverageEnergyUsage()){
                mostEnergy = device;
            }
        }
        System.out.println("Device consuming the most energy: " + mostEnergy);
    }

    public void checkSensors(){
        for (SmartDevice device : allSmartDevices){
            if (device instanceof MotionSensor){
                if (((MotionSensor) device).isMotionDetected()){
                    String prefix = (LocalDateTime.now().getHour() >= 12)? "PM":"AM";
                    System.out.printf("\nMotion detected in room %s at %d:%d %s",device.getRoom(),LocalDateTime.now().getHour(),LocalDateTime.now().getMinute(),prefix);

                }
            }
        }
    }
}
