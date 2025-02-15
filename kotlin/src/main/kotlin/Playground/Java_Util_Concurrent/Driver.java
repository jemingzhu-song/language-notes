package Playground.Java_Util_Concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // When you run this main method, the below will be printed in a different order every time
        executorService.submit(new Task("1"));
        executorService.submit(new Task("3"));
        executorService.submit(new Task("10"));
        executorService.submit(new Task("8"));
        System.out.println("Hello World!");
    }
}
