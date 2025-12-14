package F1MENTIONED;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class F1Pilots {
    private Map<String,F1Pilot> pilots;

    public F1Pilots(){
        this.pilots = new LinkedHashMap<>();
    }

    public void fillMap(String name, F1Pilot pilot){
        pilots.putIfAbsent(name,pilot);
    }

    public Map<String, F1Pilot> getPilots() {
        return pilots;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (F1Pilot pilot : pilots.values()){
            sb.append(pilot).append("\n");
        }

        return sb.toString();
    }
}
