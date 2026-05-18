class recharge{
    int mobile;
    int planamount;
    recharge(int mobile, int planamount){
         this.mobile = mobile;
         this.planamount = planamount;
     }
}

class datarecharge extends recharge{
    int datalimt;
    
    datarecharge(int mobile, int planamount, int datalimt){
        super(mobile, planamount);
        this.datalimt = datalimt;
    }
    
    void display(){
        System.out.println("datarecharge record: ");
        System.out.println("mobile: " + mobile);
        System.out.println("planamount : " + planamount);
        System.out.println("datalimt: " + datalimt);
    }
}

public class Main
{
	public static void main(String[] args) {
	    datarecharge s1 = new datarecharge(70273523773, 212, 21, 23);
		s1.display();
	}
}
