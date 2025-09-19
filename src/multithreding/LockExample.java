package multithreding;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;


public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                call.mobile_call();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                call.webex_call();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                call.whatsupp_call();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
class Call{
    Lock lock = new ReentrantLock();
    void mobile_call(){
        try{
            lock.lock();
            System.out.println("mobile call starts");
            Thread.sleep(3000);;
            System.out.println("mobile call ends");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
    void whatsupp_call(){
        try{
            lock.lock();
            System.out.println("whatsupp call starts");
            Thread.sleep(3000);;
            System.out.println("whatsupp call ends");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
    void webex_call(){
        try{
            lock.lock();
            System.out.println("webex call starts");
            Thread.sleep(3000);;
            System.out.println("webex call ends");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
}