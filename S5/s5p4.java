import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            String num1Str = scanner.nextLine();
            int num1 = Integer.parseFloat(num1Str);
            
            System.out.print("Enter second number: ");
            String num2Str = scanner.nextLine();
            int num2 = Integer.parseFloat(num2Str);
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}