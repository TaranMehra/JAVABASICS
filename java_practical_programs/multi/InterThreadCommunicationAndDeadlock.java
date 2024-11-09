class BankAccount {
    private int balance = 1000;

    // Method for withdrawal with inter-thread communication
    public synchronized void withdraw(int amount) {
        System.out.println("Attempting to withdraw: " + amount);
        while (balance < amount) {
            System.out.println("Insufficient funds, waiting for deposit...");
            try {
                wait();  // Waits until balance is updated
            } catch (InterruptedException e) {
                System.out.println("Withdrawal interrupted.");
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    // Method for deposit with notify
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
        notify();  // Notifies any waiting thread
    }
}

class DeadlockDemo implements Runnable {
    private final Object lock1;
    private final Object lock2;

    public DeadlockDemo(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " locked " + lock1);
            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked " + lock2);
            }
        }
    }
}

public class InterThreadCommunicationAndDeadlock {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Thread for withdrawal
        new Thread(() -> account.withdraw(1200), "Withdrawal Thread").start();
        // Thread for deposit
        new Thread(() -> account.deposit(500), "Deposit Thread").start();

        // Deadlock example
        Object lockA = new Object();
        Object lockB = new Object();

        Thread t1 = new Thread(new DeadlockDemo(lockA, lockB), "Thread 1");
        Thread t2 = new Thread(new DeadlockDemo(lockB, lockA), "Thread 2");

        t1.start();
        t2.start();
    }
}
