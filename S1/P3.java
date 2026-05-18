import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {

        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative!");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(1000);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount to withdraw: ");


            double amount = sc.nextDouble();

            atm.withdraw(amount);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        sc.close();
    }
}
