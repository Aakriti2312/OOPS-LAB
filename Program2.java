import java.util.Scanner;

class Employee {
    private String name;
    private int empid;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

   
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    private String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Display Manager details
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class Program2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        Employee emp = new Employee(empName, empId, empSalary);

        emp.display();
        System.out.print("Enter salary increment percentage: ");
        double increment = scanner.nextDouble();
        emp.increaseSalary(increment);
        System.out.println("After salary increment:");
        emp.display();

        scanner.nextLine(); 

        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int mgrId = scanner.nextInt();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();

        Manager mgr = new Manager(mgrName, mgrId, mgrSalary, department);
        System.out.println("\nManager Details:");
        mgr.display();

        scanner.close();
    }
}