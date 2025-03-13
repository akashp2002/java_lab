import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

       
        if (limit < 1) {
            System.out.println("Please enter a positive number greater than 0.");
            return; 
        }

        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first);

    
        for (int i = 1; i < limit; i++) {
            System.out.print(", " + second);
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); 
        scanner.close();
    }
}
