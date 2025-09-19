package multithreding;

import java.util.Arrays;

public class Deamon_threads_sorting {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        Thread_sort thread = new Thread_sort(arr);
        Deamon_thread_sort deamon = new Deamon_thread_sort(arr);
        deamon.setDaemon(true);
        thread.start();
        deamon.start();
    }
}
class Thread_sort extends Thread{
    int[] list;
    Thread_sort(int[] list){
        this.list=list;
    }
    public void run(){
        try{
            for(int i=0;i<list.length;i++){
                for(int j=i+1;j<list.length;j++){
                    if(list[i]>list[j]){
                        int temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                    sleep(100);
                }
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Deamon_thread_sort extends Thread{
    int[] list;
    Deamon_thread_sort(int[] list){
        this.list=list;
    }
    public void run(){
        while(true){
            try{
                sleep(100);
                System.out.println(System.currentTimeMillis()+"seconds are done");
                System.out.println("current array is "+ Arrays.toString(list));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
