import java.util.*;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Account> accounts = new HashMap<>();

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Show Balance\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter holder name: ");
                    String holderName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    accounts.put(accountNumber, new Account(accountNumber, holderName, balance));
                    System.out.println("Account created.");
                }
                case 2 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    if (accounts.containsKey(accountNumber)) {
                        System.out.print("Enter deposit amount: ");
                        double amount = scanner.nextDouble();
                        accounts.get(accountNumber).deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    if (accounts.containsKey(accountNumber)) {
                        System.out.print("Enter withdrawal amount: ");
                        double amount = scanner.nextDouble();
                        accounts.get(accountNumber).withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    if (accounts.containsKey(accountNumber)) {
                        accounts.get(accountNumber).showBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
