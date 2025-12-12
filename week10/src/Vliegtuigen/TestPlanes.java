package Vliegtuigen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPlanes {
    public static void main(String[] args) {
        Plane v1 = new Plane(new PlaneType("A345", "Airbus A340-541"), "A6-EHD", "Etihad Airways");
        Plane v2 = new Plane(new PlaneType("B739", "Boeing 737-9K2"), "PH-BXR", "KLM");
        Plane v3 = new Plane(new PlaneType("B748", "Boeing 747-830"), "D-ABYQ", "Lufthansa");
        Plane v4 = new Plane(new PlaneType("A333", "Airbus A330-323X"), "N820NW", "Delta Air Lines");
        Plane v5 = new Plane(new PlaneType("A333", "Airbus A330-343X"), "C-GFAJ", "Air Canada");


        List<Plane> planes = new ArrayList<>();


        planes.add(v1);
        planes.add(v2);
        planes.add(v3);
        planes.add(v4);
        planes.add(v5);

        for (Plane plane : planes){
            System.out.println(plane);
        }

        System.out.println();

        Iterator<Plane> it = planes.iterator();

        while(it.hasNext()){
            Plane plane = it.next();
            if (plane.getAirline().equals("KLM")){
                it.remove();
            }
        }

        for (Plane plane : planes){
            System.out.println(plane);
        }
    }
}
