import java.lang.annotation.*;
import java.lang.reflect.*;
public class Test {
    @MyAnno2(str="second annotation",val=2)
    public static void test(String s,int a){
        Test test = new Test();
        try{
            Annotation[] annotations = test.getClass().getMethod("test",String.class,int.class).getDeclaredAnnotations();
            for(Annotation annotation : annotations){
                System.out.println(annotation);
            }
        }
        catch(NoSuchMethodException e){
            System.out.println("method does not found");
        }
    }

    public static void main(String[] args) {
        test("good", 445);
    }
}
