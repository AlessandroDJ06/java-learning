package Databank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Patiënten {
    private Map<Integer,Patiënt> patiënten;
    private int volgendeId;

    public Patiënten(){
        this.patiënten = new HashMap<>();
        this.volgendeId = 0;
    }

    public void insert(Patiënt patiënt){
        patiënt.setId(volgendeId);
        volgendeId++;
        patiënten.put(patiënt.getId(),patiënt);
    }

    public boolean delete(int id){
        if(patiënten.containsKey(id)){
            patiënten.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public Patiënt findById(int id){
        return patiënten.getOrDefault(id, null);
    }

    public Set<Patiënt> findByHuisarts(int id){
        Set<Patiënt> patiënts = new HashSet<>();
        for (Patiënt patiënt : patiënten.values()){
            if (patiënt.getHuisartsId()== id){
                patiënts.add(patiënt);
            }
        }
        return patiënts;
    }

    public Map<Integer, Patiënt> getPatiënten() {
        return patiënten;
    }
}
