package Thread.ThreadPool.CreationOfThread;

public class ExtendingThreadClass extends Thread {
    public void run() {
        System.out.println("Thread Running using thread class: " + Thread.currentThread().getName() + "  -> " +  Thread.currentThread().threadId());
    }
}

