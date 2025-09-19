package multithreding;

public class Sleep_Join extends Thread {
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Sleep_Join();
        Thread t2 = new Thread(new Mythread5());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("The end ");
    }
}
class Mythread5 implements Runnable {
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
