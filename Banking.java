import java.util.Scanner;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                account.checkBalance();
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
