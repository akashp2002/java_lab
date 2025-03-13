import java.util.Scanner;

public class grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Students Percentage :");

        double percentage=scanner.nextDouble();

        String grade;
        String message;

        if (percentage >= 90 && percentage <= 100) {
            grade = "A";
            message = "Excellent work!";
        } else if (percentage >= 80 && percentage <= 100) {
            grade = "B";
            message = "Good job!";
        } else if (percentage >= 70 && percentage <= 100) {
            grade = "C";
            message = "You can do better";
        } else if (percentage >= 60 && percentage <= 100) {
            grade = "D";
            message = "Work harder";
        }
        else if (percentage > 100) {
            grade = "F";
            message = "Invalid ";
        }
        else {
            grade = "F";
            message = "Failed. Try again";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);

        scanner.close();

    }
}
