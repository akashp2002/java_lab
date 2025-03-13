import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the employee destination(Manager/Developer/Intern):");
        String Designation = scanner.nextLine().trim();

        System.out.println("Enter years of experience: ");
        int experience = scanner.nextInt();

        double baseSalary=0,bonus=0;

        if (Designation.equalsIgnoreCase("Manager")) {
            baseSalary = 50000;
        } else if (Designation.equalsIgnoreCase("Developer")) {
            baseSalary = 30000;
        } else if (Designation.equalsIgnoreCase("Intern")) {
            baseSalary = 15000;
        } else {
            System.out.println("Invalid designation entered.");
            scanner.close();
            return;
        }

        if (experience >= 3 && experience <= 5) {
            bonus = 0.10 * baseSalary;  
        } else if (experience > 5) {
            bonus = 0.20 * baseSalary;  
        }

        double totalSalary = baseSalary + bonus;

        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();

    }
}
