package Bank;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder,String iban,double balance){
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    public BankAccount(String holder,String iban){
        this(holder,iban,0);
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public void setIban(String iban){
        this.iban = iban;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    public boolean withdraw(double amount){
        if (amount < 0 ){
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    public String getHolder() {
        return holder;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Rekeninghouder: " + this.holder +
                "\nIBAN: " + this.iban +
                "\nSaldo: " + this.balance + " EUR";
    }



}
