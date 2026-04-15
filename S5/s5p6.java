public class s5p6 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Code after try-catch-finally block");
    }
}