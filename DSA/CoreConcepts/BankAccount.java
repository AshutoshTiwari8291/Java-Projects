package CoreConcepts;

public class BankAccount {
    private double balance = 8000;

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing ₹" + amount);
            balance -= amount;
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient Funds!");
        }
    }
}
