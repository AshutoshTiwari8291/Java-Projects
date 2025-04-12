package Thread.ThreadPool.CreationOfThread;

public class UsingRunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Running using runnable interface: " + Thread.currentThread().getName() + "  -> " +  Thread.currentThread().threadId());
    }
}
