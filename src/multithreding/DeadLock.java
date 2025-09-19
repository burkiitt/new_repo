package multithreding;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
class Thread1 extends Thread {
    public void run() {
        System.out.println("trying to take monitor lock1");
        synchronized (DeadLock.lock1) {
            System.out.println("Monitor lock1 is taken by Thread1");
            System.out.println("trying to take monitor lock2");
            synchronized (DeadLock.lock2) {
                System.out.println("Monitor lock2 is taken by Thread1");
            }
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        System.out.println("trying to take monitor lock2");
        synchronized (DeadLock.lock2) {
            System.out.println("Monitor lock2 is taken by Thread2");
            System.out.println("trying to take monitor lock1");
            synchronized (DeadLock.lock1) {
                System.out.println("Monitor lock1 is taken by Thread2");
            }
        }
    }
}
