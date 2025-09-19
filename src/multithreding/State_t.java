package multithreding;

public class State_t extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getState());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new State_t();
        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println(t1.getState());

    }
    //sync - все этапы делаются поятапно
    //async - пока одна задача делается ты модешь переключится на другую задачу , concurrency
    //если у компа есть много ядер это уже будет parallelism
}
