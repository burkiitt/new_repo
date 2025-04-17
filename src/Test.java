import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
//comment
public class Test {
    @MyMarker
    public static void test() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Test test = new Test();
        try{
            Method[] methods = test.getClass().getMethods();
            for(Method method : methods){
                if(method.isAnnotationPresent(MyMarker.class)){
                    long start = System.currentTimeMillis();
                    method.invoke(test);
                    long end = System.currentTimeMillis();
                    System.out.println(end - start);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
