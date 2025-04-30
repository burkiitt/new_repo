package generics;

import java.util.*;

public class Test_sorting {
    public static void main(String[] args) {
        Integer[] list_int = {1,5,2,1,6,4,9,8,7};
        Double[] list_double = {1.0,3.0,2.0,-1.0,7.0};
        Sort sort = new Sort();
        sort.print(list_int);
        sort.sort(list_int);
        sort.print(list_int);
        sort.print(list_double);
        sort.sort(list_double);
        sort.print(list_double);

    }
}
