
class person{
    String name;
    int age;
    person(String name, int age){
         this.name = name;
         this.age = age;
     }
}

class student extends person{
    int roll;
    
    student(String name, int age, int roll){
        super(name, age);
        this.roll = roll;
    }
    
    void display(){
        System.out.println("student record: ");
        System.out.println("name: " + name);
        System.out.println("age : " + age);
        System.out.println("roll: " + roll);
    }
}

public class Main
{
	public static void main(String[] args) {
	    student s1 = new student("amit", 12, 1);
		s1.display();
	}
}
