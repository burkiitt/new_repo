package multithreding;

public class Lock {
    public static  int a =0;
    public static synchronized void increment(){
        a++;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a);

    }

}
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Lock.increment();
        }
    }
}