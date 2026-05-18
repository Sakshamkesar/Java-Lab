
class vehicle{
    String name;
    int number;
    person(String name, int number){
         this.name = name;
         this.number = number;
     }
}

class car extends vehicle{
    int model;
    String fuel;
    
    car(String name, int number, int model, String fuel){
        super(name, number);
        this.model = model;
        this.fuel = fuel;
    }
    
    void display(){
        System.out.println("car record: ");
        System.out.println("name: " + name);
        System.out.println("number : " + number);
        System.out.println("model: " + model);
    }
}

public class Main
{
	public static void main(String[] args) {
	    car s1 = new student("amit", 12, 1, petrol);
		s1.display();
	}
}
