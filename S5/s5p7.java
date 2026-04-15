public class underageException extends Exception {
    public underageException(String message) {
        super(message);
    }
}
public class p7 {
    public static void main(String[] args) {
        int age = 15; 

        try {
            checkAge(age);
        } catch (underageException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws underageException {
        if (age < 18) {
            throw new underageException("You must be at least 18 years old.");
        } else {
            System.out.println("Access granted. You are old enough.");
        }
    }
}