
public class BankAccount
{
    String name;
    int balance;
    
    BankAccount(String n, int b){
        this.name = n;
        this.balance = b;
    }
    
    void deposit(int b){
        this.balance =+ b;
        System.out.println("successfully deposit : " + b);
    }
    void displayBalance(){
        System.out.println("total balance is:" + this.balance);
    }
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("pranav", 4623);
		b1.deposit(456);
		b1.displayBalance();
	}
}
