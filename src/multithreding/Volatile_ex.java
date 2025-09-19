package multithreding;

public class Volatile_ex extends Thread {
    public volatile boolean  flag = true;
    public void run() {
        long i = 0;
        while (flag) {
            i++;
        }
        System.out.println("while loop has ended i = "+i);
    }
    public static void main(String[] args) throws InterruptedException {
        Volatile_ex vo = new Volatile_ex();
        vo.start();
        Thread.sleep(5000);
        System.out.println("thread is working 5 seconds");
        vo.flag = false;
        vo.join();
        System.out.println("thread has ended");
    }
    //volatile - это когда переменная хранится толлько в main memory . все потоки должны читать отттуда ,  не сохряняя его в свой кэш
    // его лучше использовать тогда , когда только один поток может изменить переменную , а другие толко читают
}

