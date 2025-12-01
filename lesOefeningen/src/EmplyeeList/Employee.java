package EmplyeeList;

import java.util.Objects;

public class Employee {
    private String name;
     public Employee(String name){
         this.name = name;
     }

     public String getName(){
         return name;
     }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Employee employee)) return false;
        return Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
