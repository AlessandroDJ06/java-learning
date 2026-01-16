import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        //deel 1
        MotionSensor sensor1 = new MotionSensor("sensor 1","hall");
        MotionSensor sensor2 = new MotionSensor("sensor 2","LivingRoom");
        sensor2.setMotionDetected(true);
        SmartLight light1 =  new SmartLight("Light1","LivingRoom",25);
        SmartLight light2 =  new SmartLight("Light2","Kitchen",40);

        SmartDevice[] devicesArray = {sensor1,sensor2,light1,light2};

        for (SmartDevice device : devicesArray) {
            System.out.println(device);
        }

        //deel2
        System.out.println("====DEEL2====");
        SmartHomeController controller = new SmartHomeController();
        for (SmartDevice device : devicesArray) {
            controller.addSmartDevice(device);
        }
        controller.turnOnAllDevices();
        controller.showSortedById();

        //deel3
        System.out.println("===DEEL3===");

        controller.showRooms();
        controller.deviceConsumingMostEnergy();
        controller.checkSensors();


    }
}
