import java.util.Scanner;


public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalnum=num;
        int reversednum=0;

        while (num!=0) {

            int digit=num%10;
            reversednum= reversednum *10 +digit;
            num /=10;
        }

        if (originalnum == reversednum) {
            System.out.println(originalnum + " is a Palindrome number.");
        } else {
            System.out.println(originalnum + " is NOT a Palindrome number.");
        }
        scanner.close();
    }
    
}   
