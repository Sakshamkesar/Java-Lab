public class Message
{
    String text;
    
    Message(String text){
        this.text = text;
    }
    
    void displayLength(){
        System.out.println("length of text is :" + this.text.length());
    }
    
    void toUpperCase(){
        System.out.println("uppercase text: " + this.text.toUpperCase());
    }
    

	public static void main(String[] args) {
		Message m1 = new Message("hello world");
		m1.displayLength();
		m1.toUpperCase();
	}
}
