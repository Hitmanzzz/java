class Person {
    protected String name;
    protected String gender;
    protected String address;
    protected int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    protected int empid;
    protected String company_name;
    protected String qualification;
    protected double salary;

    public Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    private String subject;
    private String department;
    private int teacherid;

    public Teacher(String name, String gender, String address, int age, int empid, String company_name, String qualification, double salary, String subject, String department, int teacherid) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherid);
    }
}

public class Main12 {
    public static void main(String[] args) {
        int N = 2; // Number of teachers

        Teacher[] teachers = new Teacher[N];

        teachers[0] = new Teacher("Sekharan", "Male", "SKYLINE 12B", 35, 1001, "IBM", "Diploma", 50000.0, "MICROPROCESSOR", "Computer Science", 1998);
        teachers[1] = new Teacher("Abel", "Male", "DELMINGHAM St", 36, 509, "Infosys", "Ph.D.", 60000.0, "English", "Commerce", 1997);

        System.out.println("Teacher Details:");
        for (int i = 0; i < N; i++) {
            System.out.println("\nTeacher " + (i + 1) + ":");
            teachers[i].display();
        }
    }
}
