class Task implements Runnable {
    public void run() {
        System.out.println("Executing task: " + Thread.currentThread().getName());
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Thread task1 = new Thread(new Task());
        Thread task2 = new Thread(new Task());

        task1.start();
        task2.start();
    }
}
