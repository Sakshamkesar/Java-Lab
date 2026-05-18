package company;

public class HR {
    public void modifySalary() {
        Employee emp = new Employee();


        emp.salary = 60000;

        
        emp.bonus = 7000;

        System.out.println("HR updated salary: " + emp.salary);
        System.out.println("HR updated bonus: " + emp.bonus);
    }
}
