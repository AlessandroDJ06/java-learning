package LijstVanObjecten;

import java.util.Arrays;
import java.util.Objects;

public class List {
    private final int MAX_CAPACITY = 100;
    private Object[] objects;
    private int size;

    public List(){
        this.objects = new Object[MAX_CAPACITY];
        this.size = 0;
    }

    public boolean add(Object object){
        if (size < MAX_CAPACITY){
            objects[size] = object;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public Object get(int index){
        return (index < MAX_CAPACITY)? objects[index]:null;
    }

    public int getSize(){
        return size;
    }

    public int get(Object object){
        for (int i = 0; i < size; i++){
            if (objects[i].equals(object)){
                return i;
            } else if (object.getClass().isArray() && objects[i].getClass().isArray()) {
                if (Arrays.deepEquals(new Object[]{objects[i]},new Object[]{object})){
                    return i;
                }
            }
        } return -1;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof List list)) return false;
        return MAX_CAPACITY == list.MAX_CAPACITY && getSize() == list.getSize() && Objects.deepEquals(objects, list.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MAX_CAPACITY, Arrays.hashCode(objects), getSize());
    }
}
