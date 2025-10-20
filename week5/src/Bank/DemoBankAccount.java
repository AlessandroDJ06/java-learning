package Bank;

public class DemoBankAccount {
    public static void main(String[] args) {
        BankAccount greg  = new BankAccount("Gregory Farouk", "BE15 6474 3001 5840");
        System.out.println(greg);
        greg.deposit(-2000);
        greg.deposit(3000);
        System.out.println(greg);
        if (greg.withdraw(2000)) {
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }
        greg.withdraw(-5000);
        if (greg.withdraw(1500)) {
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }

        BankAccount djordin = new BankAccount("Djordin Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + djordin);
        djordin.deposit(6487);
        System.out.println("Saldo van " + djordin.getHolder() + " = " + djordin.getBalance());
    }
}
