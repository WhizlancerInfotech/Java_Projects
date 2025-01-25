import java.util.*;

class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        this.isIssued = true;
    }

    public void returnBook() {
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho"));
        books.add(new Book("1984", "George Orwell"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. View Books\n2. Issue Book\n3. Return Book\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> books.forEach(System.out::println);
                case 2 -> {
                    System.out.print("Enter book title to issue: ");
                    String title = scanner.nextLine();
                    books.stream()
                         .filter(book -> book.toString().contains(title) && !book.isIssued())
                         .findFirst()
                         .ifPresentOrElse(Book::issue, () -> System.out.println("Book not found or already issued."));
                }
                case 3 -> {
                    System.out.print("Enter book title to return: ");
                    String title = scanner.nextLine();
                    books.stream()
                         .filter(book -> book.toString().contains(title) && book.isIssued())
                         .findFirst()
                         .ifPresentOrElse(Book::returnBook, () -> System.out.println("Book not found or not issued."));
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
