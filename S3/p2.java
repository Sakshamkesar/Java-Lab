
class emplyee{
    String name;
    int salary;
    person(String name, int salary){
         this.name = name;
         this.salary = salary;
     }
}

class mangaer extends emplyee{
    int bonus;
    
    mangaer(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    
    int calcTotal(){
        System.out.println("total salary: " + (salary + bonus));
    }
    
    void display(){
        System.out.println("student record: ");
        System.out.println("name: " + name);
        System.out.println("salary : " + salary);
        
    }
}

public class Main
{
	public static void main(String[] args) {
	    mangaer s1 = new mangaer("amit", 100002, 1);
		s1.display();
		s1.calcTotal();
	}
}
