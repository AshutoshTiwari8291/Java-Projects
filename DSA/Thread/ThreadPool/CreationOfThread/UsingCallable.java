package Thread.ThreadPool.CreationOfThread;

import java.util.concurrent.Callable;

public class UsingCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello From callable.... New Thread is creted: " + Thread.currentThread().getName() + "  --> " + Thread.currentThread().threadId();
    }
}
