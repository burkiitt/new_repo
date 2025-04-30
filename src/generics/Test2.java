package generics;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(sum(list));
        List<Double> list_double = new ArrayList<>();
        list_double.add(1.1);
        list_double.add(2.2);
        list_double.add(3.3);
        System.out.println(sum(list_double));
//        List<String> list1 = new ArrayList<>();
//        list1.add("one");
//        list1.add("two");
//        list1.add("three");
//        printList(list1);
//        printList(list);
//        List<? extends Number> list2 = new ArrayList<Integer>();
    }
    public static void printList(List<?> list) {
        System.out.println("the list comtains : " + list);

    }
    public static double sum (List<? extends Number> list ){
        double sum = 0;
        for(Number number : list){
            sum+=number.doubleValue();
        }
        return sum ;
    }
}
