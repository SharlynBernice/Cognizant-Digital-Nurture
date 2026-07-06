public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= amount;
    }

    // Check balance
    public double getBalance() {
        return balance;
    }
}