import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        System.out.print("Enter the pattern to search: ");
        String pattern = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        String result = original.replace(pattern, replacement);

        System.out.println("\nModified String: " + result);

        scanner.close();
    }
}

