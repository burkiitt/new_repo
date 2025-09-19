package Stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(list).forEach(a ->{
            a=a*a;
            System.out.print(a+" ");
        });
    }
}
