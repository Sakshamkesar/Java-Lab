
public class Student 
{
    String name;
    int roll;
    
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    void display(){
        System.out.println("name "+this.name);
        System.out.println("rollno. "+this.roll);
        
    }
	public static void main(String[] args) {
		Student s1 = new Student("pranav", 24);
		s1.display();
	}
}
