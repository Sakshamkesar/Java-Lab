class order{
    String orderid;
    int amout;
    order(String orderid, int amout){
         this.orderid = orderid;
         this.amout = amout;
     }
}

class onlineorder extends order{
    int deliverycharge;
    
    onlineorder(String orderid, int amout, int deliverycharge){
        super(orderid, amout);
        this.deliverycharge = deliverycharge;
    }
    
    void display(){
        System.out.println("onlineorder record: ");
        System.out.println("orderid: " + orderid);
        System.out.println("amout : " + amout);
        System.out.println("deliverycharge: " + deliverycharge);
        System.out.println("total amount: " + (amount +deliverycharge));
    }
}

public class Main
{
	public static void main(String[] args) {
	    onlineorder s1 = new onlineorder("amit", 152, 14);
		s1.display();
	}
}
