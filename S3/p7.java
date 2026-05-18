
class student{
    String name;
    int marks;
    student(String name, int marks){
         this.name = name;
         this.marks = marks;
     }
}

class result extends student{
    String grade;
    
    result(String name, int marks, String grade){
        super(name, marks);
        this.grade = grade;
    }
    
    void display(){
        System.out.println("student record: ");
        System.out.println("name: " + name);
        System.out.println("marks : " + marks);
        System.out.println("grade: " + grade);
    }
}

public class Main
{
	public static void main(String[] args) {
	    result s1 = new result("amit", 12, "A+");
		s1.display();
	}
}
