package finance;

import company.Employee;

public class Finance {
    public void accessEmployee() {
        Employee emp = new Employee();

        System.out.println("Finance cannot access salary or bonus directly");
    }
}
