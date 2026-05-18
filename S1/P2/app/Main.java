package app;

import bank.BankAccount;
import premium.PremiumAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);


        System.out.println("Balance: " + acc.checkBalance());


        PremiumAccount p = new PremiumAccount(2000);
        p.showBalance(); 
    }
}
