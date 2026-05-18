
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class UserRegistration {

    public void register(String name, int age, String email)
            throws InvalidNameException, InvalidAgeException, InvalidEmailException {

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be empty!");
        }

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }

        if (email == null || !email.contains("@")) {
            throw new InvalidEmailException("Invalid email! Must contain '@'");
        }

        System.out.println("Registration Successful!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}


public class Main {
    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        try {
            user.register("John", 20, "john@example.com");

        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
