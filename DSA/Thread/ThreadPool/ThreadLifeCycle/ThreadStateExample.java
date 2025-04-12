package Thread.ThreadPool.ThreadLifeCycle;

public class ThreadStateExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t  = new ThreadLifeCycle();

        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(500);
        System.out.println(t.getState());
    }
}

