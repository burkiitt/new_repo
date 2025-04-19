package generics;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("df");
        list.add(new Test());
        System.out.println(list);
    }
}


