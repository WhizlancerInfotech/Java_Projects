import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                students.add(new Student(id, name, age));
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                for (Student student : students) {
                    System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age);
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
