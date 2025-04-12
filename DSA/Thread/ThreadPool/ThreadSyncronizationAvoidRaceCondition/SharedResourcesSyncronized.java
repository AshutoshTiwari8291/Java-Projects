package Thread.ThreadPool.ThreadSyncronizationAvoidRaceCondition;

public class SharedResourcesSyncronized {
    public static void main(String[] args) {
        printNumbers();
    }

    synchronized static void printNumbers() {
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }
    }
}
