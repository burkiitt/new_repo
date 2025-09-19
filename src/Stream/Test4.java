package Stream;

import java.util.*;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        int c = list.stream().reduce((a,b)->{
//            return a*b;
//        }).get();
//        //System.out.println(c);
////        List<Integer> list2 = new ArrayList<>();
////        Optional<Integer> o = list2.stream().reduce((a, b)->{
////            return a*b;
////        });
////        if(o.isPresent()){
////            System.out.println(o.get());
////        }
////        else {
////            System.out.println("Sorry");
////        }
//        List<String> list2 = new ArrayList<>();
//        list2.add("Privet ");
//        list2.add(",");
//        list2.add("Kak");
//        list2.add(" ti");
//        String s  = list2.stream().reduce((a,b)->{
//            return a+b;
//        }).get();
//        System.out.println(s);
        //task from gpt
        List<Integer> prices = Arrays.asList(120, 50, 300, 20, 75);
        int a = prices.stream().reduce((i,j)->{
            return i+j;
        }).get();
        int b = prices.stream().reduce((i,j)->{
            if(i>j){
                return i;
            }
            return j;
        }).get();
        int c = prices.stream().reduce((i,j)->{
            return i*j;
        }).get();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        List<String> words = Arrays.asList("Java", "Stream", "API", "Reduce");
        String word  = words.stream().reduce((s,d)->{
            return s+" "+d;
        }).get();
        System.out.println(word);
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 1, 2, 5);
        int var = 0;


    }
}
