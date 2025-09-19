package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);
        int[] array = {1,2,3,4,5,6};
        int[] copy = Arrays.stream(array).map(a->{
            if(a%2==0){
                return a*a;
            }
            return a;
        }).toArray();
        System.out.println(Arrays.toString(copy));
    }
}
