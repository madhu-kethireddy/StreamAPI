import java.util.Optional;
import java.util.stream.Stream;

public class StreamFirstAny {
    public static void main(String args[]){

        Stream<String>  tream = Stream.of("java","kotlin", "ruby", "sun", "ala");
        Optional<String> res = tream.sorted().findFirst();
        System.out.println(res);

        Stream<String> t = Stream.of("ala","kotlin", "ruby", "sun", "java");
        Optional<String> st = t.filter(s -> s.length() >= 3 && s.length() < 5).findAny();
        System.out.println(st);
    }
}
