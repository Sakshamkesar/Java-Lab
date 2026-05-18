
class account{
    int accountno;
    int balance;
    account(int accountno, int balance){
         this.accountno = accountno;
         this.balance = balance;
     }
}

class savingacc extends account{
    int interestrate;
    
    savingacc(int accountno, int balance, int interestrate){
        super(accountno, balance);
        this.interestrate = interestrate;
    }
    
    void display(){
        System.out.println("savingacc record: ");
        System.out.println("accountno: " + accountno);
        System.out.println("balance : " + balance);
        System.out.println("interestrate: " + interestrate);
        System.out.println("interest: " + ((balance * interestrate)/100);
    }
}

public class Main
{
	public static void main(String[] args) {
	    savingacc s1 = new savingacc(45867, 1002, 1);
		s1.display();
	}
}
