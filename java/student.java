import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the Mark of Maths:");
        float maths=scanner.nextFloat();

        System.out.println("enter the Mark of Physics:");
        float Physics=scanner.nextFloat();

        System.out.println("enter the Mark of Chemistry:");
        float Chemistry=scanner.nextFloat();

        float totalmark = maths + Physics + Chemistry;
        float totalmathphy = maths + Physics;

        if (totalmark >= 150 || totalmathphy >= 100) {
            System.out.println("Student is eligible.");
        } else {
            System.out.println("Student is not eligible.");
        }

        scanner.close();


    }
}
