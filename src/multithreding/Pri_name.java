package multithreding;

public class Pri_name {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.setName("berkut");
        mythread.setPriority(8);
        System.out.println("mythread name = "+mythread.getName()+"  priority = "+mythread.getPriority());
    }
}
class Mythread extends Thread{
    public void run(){
        System.out.println("privet");
    }
}