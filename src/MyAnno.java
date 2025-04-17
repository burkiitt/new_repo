import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

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
