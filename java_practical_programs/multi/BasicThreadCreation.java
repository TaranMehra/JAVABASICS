// Thread creation using Runnable Interface
class RunnableTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Task - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Runnable Task Interrupted.");
            }
        }
    }
}

// Thread creation by extending the Thread class
class ThreadTask extends Thread {
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Thread Task - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread Task Interrupted.");
            }
        }
    }
}

public class BasicThreadCreation {
    public static void main(String[] args) {
        System.out.println("Starting Threads using Runnable and Thread");

        // Creating and starting the Runnable task
        Thread runnableThread = new Thread(new RunnableTask());
        runnableThread.start();

        // Creating and starting the Thread task
        ThreadTask threadTask = new ThreadTask();
        threadTask.start();
    }
}
