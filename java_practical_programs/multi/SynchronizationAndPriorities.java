class SharedCounter {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
    }
}

class CounterThread extends Thread {
    private SharedCounter sharedCounter;

    public CounterThread(SharedCounter sharedCounter, String name) {
        super(name);
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedCounter.increment();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class SynchronizationAndPriorities {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        // Creating multiple threads with different priorities
        CounterThread thread1 = new CounterThread(counter, "High Priority Thread");
        thread1.setPriority(Thread.MAX_PRIORITY);
        
        CounterThread thread2 = new CounterThread(counter, "Low Priority Thread");
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
