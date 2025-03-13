import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the radius of the circle:");
        double radius = scanner.nextDouble();
        

        double area = Math.PI * radius * radius;
        double perimeter=2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);


        scanner.close();

    }    
}
