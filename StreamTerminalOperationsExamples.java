import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperationsExamples {
    public static void main(String[] args){

        Stream<Integer> intStream = Stream.of(1,23,4,3,2);
        String s = intStream.map(String::valueOf).collect(Collectors.joining("-","<",">"));
        System.out.println(s);


        List<String> strings = Arrays.asList("a1","b1","c1","v2","a2","a3");
        Map<String, String> map = strings.stream().collect(Collectors.groupingBy(p -> p.substring(0, 1), Collectors.mapping(p -> p.substring(1,2),Collectors.joining("$"))));
        System.out.println(map);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> lst = numbers.stream()
                                    .peek(System.out::println)
                                    .filter(n -> n%2==0)
                                    .peek(System.out::println)
                                    .map(n -> n*n)
                                    .peek(System.out::println)
                                    .toList();
        System.out.println(lst);
    }
}
