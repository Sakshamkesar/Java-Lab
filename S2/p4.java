
public class Book 
{
    String title;
    int price;
    
    Book(){
        this.title = "Unknown";
        this.price = 0;
    }
    Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    
    void display(){
        System.out.println("title: "+this.title);
        System.out.println("price: "+this.price);
        
    }
	public static void main(String[] args) {
	    Book b2 = new Book();
	    b2.display();
		Book b1 = new Book("abc", 290);
		b1.display();
	}
}
