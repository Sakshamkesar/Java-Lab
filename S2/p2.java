public class Rectangle 
{
    int length;
    int width;
    
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    void displayArea(){
        int area = this.length * this.width;
        System.out.println("area "+area);

        
    }
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12, 24);
		r1.displayArea();
	}
}
