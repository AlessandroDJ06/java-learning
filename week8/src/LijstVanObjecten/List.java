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
