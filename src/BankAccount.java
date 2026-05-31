public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs." + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
