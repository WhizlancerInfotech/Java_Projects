import java.util.*;

class Employee {
    String name, department;
    int id;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

public class EmployeeManagement {
    static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(int id, String name, String department) {
        employees.add(new Employee(id, name, department));
        System.out.println("Employee added successfully!");
    }

    public static void viewEmployees() {
        for (Employee emp : employees) {
            System.out.printf("ID: %d, Name: %s, Department: %s\n", emp.id, emp.name, emp.department);
        }
    }

    public static void searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                System.out.printf("ID: %d, Name: %s, Department: %s\n", emp.id, emp.name, emp.department);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee\n2. View Employees\n3. Search Employee\n4. Exit");
            int choice = sc.nextInt();
            if (choice == 4) break;

            switch (choice) {
                case 1:
                    System.out.println("Enter ID, Name, and Department:");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String department = sc.next();
                    addEmployee(id, name, department);
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    System.out.println("Enter Employee ID:");
                    int searchId = sc.nextInt();
                    searchEmployee(searchId);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
