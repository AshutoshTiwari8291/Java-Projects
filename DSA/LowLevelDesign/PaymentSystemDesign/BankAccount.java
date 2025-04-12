package LowLevelDesign.PaymentSystemDesign;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // withdraw and deposit

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
