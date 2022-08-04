package Concurrency.Synchronised;

public class MyThread implements Runnable {
    private String identifier;

    public MyThread(String identifier) {
        this.identifier = identifier;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " from identifier: " + identifier + " | at time: "
                + System.nanoTime());
                // try {
                //     Thread.sleep(500);
                // } catch (InterruptedException e) {
                // }
            }
        }
    }
}
