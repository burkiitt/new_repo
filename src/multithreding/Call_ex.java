package multithreding;

public class Call_ex {
    static final Object lock = new Object();
    void mobileCall() {
        synchronized (lock) {
            System.out.println("call mobile");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobile call finished");
        }
    }
    void skipeCall(){
        synchronized (lock){
            System.out.println("skipe mobile");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skipe call finished");
        }
    }void whatcupCall(){
        synchronized (lock){
            System.out.println("whatsup mobile");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsup call finished");
        }
    }

    public static void main(String[] args) {
        Thread mobile_t  = new Thread(new ImpMobile());
        Thread whatcup_t  = new Thread(new ImpWhatsup());
        Thread skype_t  = new Thread(new ImpSkype());
        mobile_t.start();
        whatcup_t.start();
        skype_t.start();

    }
}
class ImpMobile implements Runnable {
    public void run() {
        new Call_ex().mobileCall();
    }
}
class ImpSkype implements Runnable {
    public void run() {
        new Call_ex().skipeCall();
    }
}
class ImpWhatsup implements Runnable {
    public void run() {
        new Call_ex().whatcupCall();
    }
}
//Невозможно синхронизировать конструктор