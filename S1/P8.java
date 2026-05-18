import java.util.Scanner;


class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            try {
                System.out.print("Enter username: ");
                String username = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();


                if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                    throw new Exception("Invalid credentials!");
                }


                System.out.println("Login successful!");
                break;

            } catch (Exception e) {
                attempts++;
                System.out.println("Error: " + e.getMessage());
                System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));


                if (attempts == MAX_ATTEMPTS) {
                    try {
                        throw new AccountLockedException("Account locked after 3 failed attempts!");
                    } catch (AccountLockedException ex) {
                        System.out.println("Critical: " + ex.getMessage());
                    }
                }
            }
        }

        sc.close();
    }
}
