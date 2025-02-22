import java.util.Scanner;

class Employee {
    String name;
    double salary, tax, netSalary;

    void calculateSalary() {
        tax = salary * 0.1;
        netSalary = salary - tax;
    }

    void displayPayslip() {
        System.out.println("Employee: " + name + "\nNet Salary: $" + netSalary);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        emp.name = sc.nextLine();
        System.out.print("Enter salary: ");
        emp.salary = sc.nextDouble();

        emp.calculateSalary();
        emp.displayPayslip();
        sc.close();
    }
}
