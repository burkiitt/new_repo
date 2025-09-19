package lambda_expression;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbbb");
        list.add("cc");
        list.add("d");
        list.add("ee");
        list.removeIf(c->c.length()<5);
        System.out.println(list);
    }
}
