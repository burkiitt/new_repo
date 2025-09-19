package Stream;
import java.util.stream.Stream;
public class Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5) ;
        Stream<Integer> stream2 = Stream.of(6,7,8,9) ;
        Stream<Integer> concat = Stream.concat(stream1, stream2) ;
        concat.forEach(System.out::println);
        //concat не может быть использован вместе с другими потоками

    }
}
