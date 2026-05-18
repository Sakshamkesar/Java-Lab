
public class Student
{
    int marks[] = new int[5];
    
    Student(int m[]){
        for (int i = 0; i < 5; i++){
            this.marks[i] = m[i];
        } 
    }
    
    void average(){
        int sum = 0;
        for (int i =0; i<5; i++){
            sum += this.marks[i];
        } 
        double average = (double) sum/5;
        System.out.println("average marks: " + average);
    }
	public static void main(String[] args) {
	    int m[] = {87, 95, 78, 90, 89};
        Student s1 = new Student(m);
        s1.average();
	}
}
