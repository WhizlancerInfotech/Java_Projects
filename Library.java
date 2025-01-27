import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Author Name: ");
                String author = scanner.nextLine();
                books.add(new Book(title, author));
                System.out.println("Book added successfully!");
            } else if (choice == 2) {
                for (Book book : books) {
                    System.out.println("Title: " + book.title + ", Author: " + book.author);
                }
            } else if (choice == 3) {
                System.out.print("Enter title to search: ");
                String searchTitle = scanner.nextLine();
                for (Book book : books) {
                    if (book.title.equalsIgnoreCase(searchTitle)) {
                        System.out.println("Found - Title: " + book.title + ", Author: " + book.author);
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
