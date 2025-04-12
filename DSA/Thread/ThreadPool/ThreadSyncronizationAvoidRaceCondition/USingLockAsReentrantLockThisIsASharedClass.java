package Thread.ThreadPool.ThreadSyncronizationAvoidRaceCondition;

import java.util.concurrent.locks.ReentrantLock;

// More flexible than syncronized approach
public class USingLockAsReentrantLockThisIsASharedClass {
    final static ReentrantLock lock = new ReentrantLock();


    void printNumbers() {
        lock.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        } finally {
            lock.unlock();
        }
    }
}
