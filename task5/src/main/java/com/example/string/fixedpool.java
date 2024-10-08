package com.example.string;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class fixedpool{
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        
        for (int i = 1; i <= 5; i++) {
            Runnable task = new Task(i);
            executor.submit(task);
        }

     
        executor.shutdown();
    }
}

class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Executing Task " + taskId + " - " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate task execution time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + taskId + " completed.");
    }
}
