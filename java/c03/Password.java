import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Password {
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one number.");
        }

        if (!password.matches(".*[\\$#&).]*")) {
            throw new InvalidPasswordException("Password must contain at least one special character ($, #, &, ).");
        }
        
        System.out.println("Password is valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();  
        
        try {
            validatePassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();  
        }
    }
}
