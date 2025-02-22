import java.util.Scanner;

class ATM {
    private double balance = 5000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) System.out.println("Insufficient funds!");
        else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int choice = sc.nextInt();
            if (choice == 4) break;
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            if (choice == 1) atm.deposit(amount);
            else if (choice == 2) atm.withdraw(amount);
            else if (choice == 3) atm.checkBalance();
        }
        sc.close();
    }
}
