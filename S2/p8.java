
public class Student 
{
    String name;
    int marks;
    
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    
    void display(){
        System.out.println("name "+this.name);
        System.out.println("marks "+this.marks);
        
    }
	public static void main(String[] args) {
		Student[] s = new Student[3];
		s[0] = new Student("abc", 87);
		s[1] = new Student("bvg", 89);
		s[2] = new Student("abs", 76);
		
		s[0].display();
		s[1].display();
		s[2].display();
	}
}
