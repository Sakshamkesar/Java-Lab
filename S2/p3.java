public class Employee 
{
    String name;
    String designation;
    int Salary;
    
    Employee(String name, String designation, int Salary){
        this.name = name;
        this.designation = designation;
        this.Salary = Salary;
    }
    
    void display(){
        System.out.println("name "+this.name);
        System.out.println("designation "+this.designation);
        System.out.println("Salary "+this.Salary);
        
    }
	public static void main(String[] args) {
		Employee e1 = new Employee("pranav", "manager", 1000000000);
		e1.display();
	}
}
