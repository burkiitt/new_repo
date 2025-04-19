import java.lang.annotation.Annotation;
public class Depre {
    @MyMarker
    public static void main(String[] args) {
        Depre depre = new Depre();
        Class<?> obj = depre.getClass();
        System.out.println(obj.getAnnotation(Annotation.class));
    }
}
