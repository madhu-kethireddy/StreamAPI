import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args){

        Stream<String> list = Stream.of("java","kotlin", "ruby", "sun", "scala");
        long res = list.count();
        System.out.println(res);

        Stream<String> lst = Stream.of("java","kotlin", "ruby", "sun", "scala");
        Optional<String> result = lst.min(Comparator.comparingInt(String::length));
        System.out.println(result);

        Stream<String> lt = Stream.of("java","kotlin", "ruby", "sun", "scala");
        Optional<String> output = lt.min(Comparator.naturalOrder());
        System.out.println(output);

        Stream<String> lat = Stream.of("java","kotlin", "ruby", "sun", "scala");
        double value = lat.mapToInt(s -> s.length()).average().getAsDouble();
        System.out.println(value);

        Stream<String> lmt = Stream.of("java","kotlin", "ruby", "sun", "scala");
        boolean rs = lmt.anyMatch(s -> Pattern.matches("\\w{2}",s));
        System.out.println(rs);

        Stream<String> t = Stream.of("java","kotlin", "ruby", "sun", "scala");
        boolean ma = t.noneMatch(v -> v.equals("madhu"));
        System.out.println(ma);



    }
}
