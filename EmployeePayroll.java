import java.util.Scanner;

class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displaySalary() {
        System.out.println("\nEmployee: " + name);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter Hours Worked: ");
        int hoursWorked = scanner.nextInt();
        Employee emp = new Employee(name, hourlyRate, hoursWorked);
        emp.displaySalary();
    }
}