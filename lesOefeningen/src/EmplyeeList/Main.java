package EmplyeeList;

public class Main {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        list.add(new Employee("alex"));
        list.add(new Employee("pieter"));
        list.add(new Employee("david"));
        list.add(new Employee("tim"));

        System.out.println(list);


    }
}
