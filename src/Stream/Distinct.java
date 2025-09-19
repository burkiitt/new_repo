package Stream;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,2,2,2,2,2,3,4,5) ;
        //stream1.distinct().forEach(System.out::println);
        //System.out.println(stream1.distinct().count());
        System.out.println(stream1.distinct().peek(System.out::println).count()); // peek тот жк самый forEach просто intermediate


    }
}
