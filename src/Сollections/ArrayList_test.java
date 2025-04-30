package Сollections;

import java.util.*;

public class ArrayList_test {
    public static void main(String[] args) {
//        Integer[] array = {1,2,3,4,5};
//        List<Integer> list = Arrays.asList(array);
//        array[0]=1000;
//        System.out.println(array);
//        System.out.println(list);
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list.retainAll(list1);
        System.out.println(list);
    }
}
