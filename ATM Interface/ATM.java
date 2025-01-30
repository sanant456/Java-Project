import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance: $" + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = sc.nextDouble();
        if (account.deposit(amount)) {
            System.out.println("Deposit successful! New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid amount! Deposit failed.");
        }
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = sc.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful! New balance: $" + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount! Withdrawal failed.");
        }
    }
}
