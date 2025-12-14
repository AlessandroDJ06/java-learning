package Dubbels;

import java.util.*;

public class Dubbels {
    private List<String> data;

    public Dubbels(List<String> data){
        this.data = data;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size();i++){
            if ((i+1)%4 == 0){sb.append(String.format("%-20s",data.get(i))).append("\n");}
            else { sb.append(String.format("%-20s",data.get(i)));}
        }
        return sb.toString();
    }

    public void verwijderDubbels(){
        data = new ArrayList<>(new HashSet<>(data));
        Collections.sort(data);
    }

}
