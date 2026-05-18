
class person{
    String name;
    int age;
    person(String name, int age){
         this.name = name;
         this.age = age;
     }
}

class patient extends person{
    String disease;
    String doctor
    
    patient(String name, int age, String disease, String doctor){
        super(name, age);
        this.disease = disease;
        this.doctor = doctor
    }
    
    void display(){
        System.out.println("patient record: ");
        System.out.println("name: " + name);
        System.out.println("age : " + age);
        System.out.println("disease: " + disease);
        System.out.println("doctor: " + doctor);
    }
}

public class Main
{
	public static void main(String[] args) {
	    patient s1 = new patient("amit", 12, "abc", "pranav");
		s1.display();
	}
}
