import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the length:");
        int  length=scanner.nextInt();
        System.out.println("enter the width:");
        int  width=scanner.nextInt();

        int area=length * width;
        int perimeter= 2 *(length+width);

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);

        scanner.close();
        
    }
}
