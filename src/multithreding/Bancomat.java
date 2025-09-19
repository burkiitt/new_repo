package multithreding;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class Bancomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Berkut",lock);
        new Employee("Arsen",lock);
        new Employee("Giga",lock);
        new Employee("Chat",lock);
        new Employee("Orko",lock);
    }
}
class Employee extends Thread{
    String name;
    private Lock lock;
    Employee(String name , Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if(lock.tryLock()){
            System.out.println(name + " waiting...");
            try{
                lock.lock();
                System.out.println(name + "is currently working");
                Thread.sleep(3000);
                System.out.println(name + " has ended");
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
        else{
            System.out.println(name + " will not wait");
        }
    }
}
