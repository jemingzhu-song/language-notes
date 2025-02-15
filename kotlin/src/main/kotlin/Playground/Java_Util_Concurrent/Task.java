package Playground.Java_Util_Concurrent;

public class Task implements Runnable {

    private String taskId;

    public Task(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Running task: " + taskId);
    }
}
