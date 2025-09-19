package multithreding;

public class Wait_notify {
    public static void main(String[] args) {
        Market market = new Market();
        Thread user_thread = new Thread(new User(market));
        Thread fabric_thread = new Thread(new Fabric(market));
        user_thread.start();
        fabric_thread.start();


    }
}
class Market{
    int breadcount = 0;
    public synchronized void getBread(){
        while(breadcount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadcount--;
        System.out.println("Client get 1 bread . Berad Count: " + breadcount);
        notify();
    }
    public synchronized void putBread(){
        while(breadcount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadcount++;
        System.out.println("Fabric has filled bread . Berad Count: " + breadcount);
        notify();
    }
}
class User implements Runnable{
    Market market = new Market();
    User(Market market){
        this.market = market;
    }
    public void run(){
        for(int i = 0; i<10; i++){
            market.getBread();
        }
    }
}
class Fabric implements Runnable{
    Market market = new Market();
    Fabric(Market market){
        this.market = market;
    }
    public void run(){
        for(int i = 0; i<10; i++){
            market.putBread();
        }
    }
}