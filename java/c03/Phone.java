class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

public class Phone {
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must contain exactly 10 digits.");
        }
        System.out.println("Phone number is valid.");
    }

    public static void main(String[] args) {
        String phoneNumber = "9876543210";

        try {
            validatePhoneNumber(phoneNumber);
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
