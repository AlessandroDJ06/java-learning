package EmplyeeList;

public class EmployeeList {
    private final static int MAX_AMOUNT = 100;
    private Employee[] employees;
    private int amount;

    public EmployeeList(){
        this.employees = new Employee[MAX_AMOUNT];
        this.amount = 0;
    }

    public void add(Employee employee){
        if (amount < MAX_AMOUNT){
            employees[amount] = employee;
            amount++;
        }
    }

    public int getSize(){
        return amount;
    }

    public Employee getEmployee(int index){
        return (index < amount)? employees[index]:null;
    }

    public int search(Employee employee){
        int index = -1;
        for (int i = 0; i < amount;i++){
            if (employees[i].equals(employee)){
                index = i;
            }
        }
        Integer i = (index >= 0) ? index : null;

        return i;
    }

    public void removeIndex(int index){
        if (index < amount){
            if (index < --amount){
                for (int i = index; i < amount; i++){
                    employees[i] = employees[i+1];
                    amount--;
                }
            } else {
                employees[index] = null;
                amount--;
            }
        }
    }

    public void removeEmployee(Employee employee){
        removeIndex(search(employee));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < amount; i++){
            sb.append(employees[i]).append("\n");
        }

        return sb.toString();
    }
}
