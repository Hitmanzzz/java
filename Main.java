import java.util.Scanner;

class Employee {
    protected int empid;
    protected String name;
    protected double salary;
    protected String address;

    public Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    private String department;
    private String subjectsTaught;

    public Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught) {
        super(empid, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        Teacher[] teachers = new Teacher[N];

        for (int i = 0; i < N; i++) {
            System.out.print("\nEnter details for Teacher " + (i + 1));

            System.out.println("Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Subjects Taught: ");
            String subjectsTaught = scanner.nextLine();

            teachers[i] = new Teacher(empid, name, salary, address, department, subjectsTaught);
        }

        System.out.println("\nTeacher Details:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println();
        }
    }
}
