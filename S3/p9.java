class book{
    String title;
    String author;
    book(String title, String author){
         this.title = title;
         this.author = author;
     }
}

class issuedbook extends book{
    int issuedate;
    int returndate;
    
    issuedbook(String title, String author, int issuedate, int returndate){
        super(title, author);
        this.issuedate = issuedate;
        this.returndate = returndate;
    }
    
    void display(){
        System.out.println("issuedbook record: ");
        System.out.println("title: " + title);
        System.out.println("author : " + author);
        System.out.println("issuedate: " + issuedate);
        System.out.println("returndate: " + returndate);
    }
}

public class Main
{
	public static void main(String[] args) {
	    issuedbook s1 = new issuedbook("how to win", "abc", 18, 24);
		s1.display();
	}
}
