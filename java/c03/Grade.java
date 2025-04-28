class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class Grade {
    public static void validateGrade(char grade) throws InvalidGradeException {
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Grade must be between A and F.");
        }
        System.out.println("Grade is valid.");
    }

    public static void main(String[] args) {
        char grade = 'G';

        try {
            validateGrade(grade);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }
}
