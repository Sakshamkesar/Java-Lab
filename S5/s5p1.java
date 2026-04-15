import java.util.*;

public class main(string args[]){
    try {
        Divide(10,0);
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
class DividebyZero extends Exception {
    public DividebyZero(String message) {
        super(message);
    }
}   

public class p1 {
    public static void Divide(int a, int b) throws DividebyZero {
        if (b == 0) {
            throw new DividebyZero("Cannot divide by zero");
        }
        else {
            System.out.println("Result: " + (a / b));
        }
       
    }
}
