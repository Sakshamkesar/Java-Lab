package premium;

import bank.BankAccount;

public class PremiumAccount extends BankAccount {

    public PremiumAccount(double balance) {
        super(balance);
    }

    public void showBalance() {

        System.out.println("Premium Balance: " + getBalanceProtected());
    }
}
