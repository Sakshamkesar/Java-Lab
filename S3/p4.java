
class product{
    String name;
    int price;
    product(String name, int price){
         this.name = name;
         this.price = price;
     }
}

class electronic extends product{
    int warranty;
    
    electronic(String name, int price, int warranty){
        super(name, price);
        this.warranty = warranty;
    }
    
    void display(){
        System.out.println("electronic record: ");
        System.out.println("name: " + name);
        System.out.println("price : " + price);
        System.out.println("warranty: " + warranty);
    }
}

public class Main
{
	public static void main(String[] args) {
	    electronic s1 = new electronic("amit", 12, 1);
		s1.display();
	}
}
