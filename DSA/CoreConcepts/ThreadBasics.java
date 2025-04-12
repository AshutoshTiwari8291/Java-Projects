package CoreConcepts;

public class ThreadBasics {

    public static void main(String[] args) {
        Thread t1 = new Thread(new BankOperations("Loan Approval"));
        Thread t2 = new Thread(new BankOperations("Account Opening"));

        t1.start();
        t2.start();
    }
}




