class Person {
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String companyName;
    String qualification;
    double salary;

    public Employee(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empid, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void displayDetails() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class School {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];

        teachers[0] = new Teacher("Ravi Kumar", "Male", "Bengaluru, Karnataka", 40, 101, "DAV Public School", "MSc Physics", 60000, "Physics", "Science", 1001);
        teachers[1] = new Teacher("Priya Sharma", "Female", "Mumbai, Maharashtra", 35, 102, "Shivaji College", "MA English", 55000, "English", "Arts", 1002);
        teachers[2] = new Teacher("Arun Singh", "Male", "Delhi", 45, 103, "Modern School", "MSc Mathematics", 70000, "Mathematics", "Science", 1003);

        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }
    }
}
