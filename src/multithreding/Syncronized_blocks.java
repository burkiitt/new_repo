package multithreding;

public class Syncronized_blocks {
    public static void main(String[] args) {
        C c = new C();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

    }
}
class Counter_minus {
    static int counter = 10;
    public static void inc(){
        synchronized (C.class) {
            Counter_minus.counter--;
            System.out.println(Counter_minus.counter);
        }
    }
}
class C implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            Counter_minus.inc();
        }
    }
}
