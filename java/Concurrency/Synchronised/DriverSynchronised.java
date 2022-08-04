package Concurrency.Synchronised;

public class DriverSynchronised {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("ID" + Integer.toString(0));
        // Spawn 10 Threads, but use the same "myThread" instance
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(myThread);
            thread.start();
        }
    }
}