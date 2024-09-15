package atmInterface;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive number.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Transaction failed.");
            return false;
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive number.");
            return false;
        }
    }
}
