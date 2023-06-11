import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;
    
    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        
        Employee[] employees = new Employee[n];
        
        // Read employee information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            
            System.out.print("Employee Name: ");
            String eName = scanner.next();
            
            System.out.print("Employee Salary: ");
            double eSalary = scanner.nextDouble();
            
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        
        System.out.print("Enter the employee number to search: ");
        int searchEno = scanner.nextInt();
        
        // Search for the employee
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchEno) {
                System.out.println("Employee Found!");
                System.out.println("Employee Details:");
                System.out.println("Employee Number: " + employees[i].eNo);
                System.out.println("Employee Name: " + employees[i].eName);
                System.out.println("Employee Salary: " + employees[i].eSalary);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
