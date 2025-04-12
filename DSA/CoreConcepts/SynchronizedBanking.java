package CoreConcepts;

public class SynchronizedBanking {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(5000), "Customer 1");
        Thread t2 = new Thread(() -> account.withdraw(5000), "Customer 2");

        t1.start();
        t2.start();
    }
}