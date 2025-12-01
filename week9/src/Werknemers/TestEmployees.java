package Werknemers;

public class TestEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new HourlyWorker("Jos", 57082332149L, 38),
                new HourlyWorker("Yousri", 61030350468L, 40),
                new SalariedEmployee("Sanae", 54110774131L, 1.6)
        };

        for (Employee employee: employees){
            System.out.println(employee + "\n");
        }

        double som = 0;
        for (Employee employee: employees){
            som += employee.getWages();
        }

        System.out.printf("Som lonen: %.2f€",som);
    }
}
