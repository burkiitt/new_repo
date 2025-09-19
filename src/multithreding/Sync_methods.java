package multithreding;

public class Sync_methods {
    public static void main(String[] args) {
        My_thread my_thread = new My_thread();
        Thread t1 = new Thread(my_thread);
        Thread t2 = new Thread(my_thread);
        Thread t3 = new Thread(my_thread);
        t1.start();
        t2.start();
        t3.start();

    }
}
class Counter{
    volatile static int counter = 0;
}
class My_thread implements Runnable{
    public synchronized void  increment(){
        Counter.counter++;
        System.out.print(Counter.counter+" ");
    }
    public void run(){
        for(int i = 0; i < 3; i++){
            increment();
        }
    }
}
//Data race - перезаписование элементов , мешает друг другу , 2 или более потоков

