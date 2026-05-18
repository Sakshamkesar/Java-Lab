package bank;

public class BankAccount {
    private double balance; 
    public BankAccount(double balance) {
        this.balance = balance;
    }


    public double checkBalance() {
        return balance;
    }


    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    protected double getBalanceProtected() {
        return balance;
    }
}
