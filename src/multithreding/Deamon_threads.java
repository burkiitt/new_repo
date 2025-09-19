package multithreding;

public class Deamon_threads {
    public static void main(String[] args) {
        User_thread ut = new User_thread();
        Deamon_thread dt = new Deamon_thread();
        dt.setDaemon(true);
        ut.start();
        dt.start();
    }
}
class User_thread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"is deamon :"+Thread.currentThread().isDaemon());
        for(char i='A';i<='Z';i++){
            try {
                sleep(200);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Deamon_thread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"is deamon :"+Thread.currentThread().isDaemon());
        for(int i =0;i<=500;i++){
            try {
                sleep(200);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
