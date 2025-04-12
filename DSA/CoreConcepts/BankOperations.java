package CoreConcepts;

public class BankOperations implements Runnable{

    private String operation;

    public BankOperations(String operation) {
        this.operation = operation;
    }


    @Override
    public void run() {
        System.out.println(operation + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulating a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(operation + " completed by " + Thread.currentThread().getName());
    }
}
