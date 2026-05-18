public class Car 
{
    String brand;
    int price;
    
    Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    
    void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("price: "+this.price);
        
    }
	public static void main(String[] args) {
		Car s1 = new Car("BMW", 240000000);
		s1.display();
	}
}
