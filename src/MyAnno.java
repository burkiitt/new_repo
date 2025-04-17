import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMarker{}
@Retention(RetentionPolicy.RUNTIME)
@interface One{
    String value();
    int val() default 0;
}