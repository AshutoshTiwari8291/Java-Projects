package Thread.ThreadPool.CreationOfThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThreadClass {
    public static void main(String[] args) throws Exception {
        ExtendingThreadClass etc = new ExtendingThreadClass();
        etc.start();
        etc.run();

        Thread t1 = new Thread(new UsingRunnableInterface());
        t1.run();

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(new UsingCallable());

        System.out.println(future.get()); // Bock and get result
        executor.shutdown();
    }
}
