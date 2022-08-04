package Concurrency.Unsyncrhonised;

public class DriverUnsynchronised {
    public static void main(String[] args) {
        // Spawn 10 Threads, but use different instances of "myThread"
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread("ID" + Integer.toString(i));
            Thread thread = new Thread(myThread);
            thread.start();
        }
        // You can also use the same instance of "myThread"
        // MyThread myThread = new MyThread("ID" + Integer.toString(0));
        // for (int i = 0; i < 10; i++) {
        //     Thread thread = new Thread(myThread);
        //     thread.start();
        // }
    }
}
