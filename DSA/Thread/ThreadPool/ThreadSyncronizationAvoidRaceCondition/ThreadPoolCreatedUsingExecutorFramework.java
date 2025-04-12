package Thread.ThreadPool.ThreadSyncronizationAvoidRaceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolCreatedUsingExecutorFramework {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0; i< 5; i++) {
            Runnable execute;
            executor.execute(() -> System.out.println("Herer"));
        }

        executor.shutdown();
    }
}
