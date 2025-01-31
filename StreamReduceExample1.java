import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExample1 {
    public static void main(String[] args){
        Stream<Integer> numStream = Stream.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5);
        int result = numStream.reduce((x,y) -> x+y).get();
        System.out.println(result);

        Stream<String> wordsStream = Stream.of("Write", "Once,", "Run", "Anywhere");
        String st = wordsStream
                            .reduce("Result: ", (x,y) -> x + " "+y);
        System.out.println(st);
    }
}
