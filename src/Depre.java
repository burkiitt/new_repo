import java.lang.annotation.Annotation;

@Deprecated
public class Depre {
    public static void main(String[] args) {
        Depre depre = new Depre();
        Class<?> obj = depre.getClass();
        System.out.println(obj.getAnnotation(Annotation.class));
    }
}
