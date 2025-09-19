package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class For_each {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        for(String str : list) {
            System.out.println(str);
        }
        list.forEach((String s)->{
            System.out.println(s);
        });
    }
}
