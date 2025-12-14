package Databank;

import java.util.HashMap;
import java.util.Map;

public class Huisartsen {
    private int volgendeId;
    private Map<Integer,Huisarts> artsen;

    public Huisartsen(){
        this.volgendeId = 0;
        this.artsen = new HashMap<>();
    }

    public void insert(Huisarts arts){
        arts.setId(volgendeId);
        volgendeId++;

        artsen.put(arts.getId(),arts);
    }

    public boolean delete(int id){
        if(artsen.containsKey(id)){
            artsen.remove(id);
            return true;
        } else {
            return false;
        }
    }
    public Huisarts findById(int id){
        return artsen.getOrDefault(id, null);
    }

    public Map<Integer, Huisarts> getArtsen() {
        return artsen;
    }
}
