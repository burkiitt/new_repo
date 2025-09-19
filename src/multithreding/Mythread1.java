package multithreding;


public class Mythread1{
    public static void main(String[] args) {
        Mythread2 mythread2 = new Mythread2();
        Mythread3 mythread3 = new Mythread3();
        Thread t1 = new Thread(new Mythread_imp());
        //t1.start();
//        mythread2.start();
//        mythread3.start();
        new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}

class Mythread2 extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println(i);
        }
    }
}
class Mythread3 extends Thread{
    public void run(){
        for(int i=1000;i>1;i--){
            System.out.println(i);
        }
    }
}
class Mythread_imp implements Runnable{
    public void run(){
        for(int i=9000 ; i<9500 ; i++){
            System.out.println(i);
        }
    }
}
