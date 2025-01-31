import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelines {
    
    public static void main(String[] args)
    {
        Stream<String> st = Stream.of("madHu", "Anamdu", "ese");
        List<String> output = st
                            .filter(s -> s.length() > 4)
                            .sorted()
                            .map(s -> s.toUpperCase())
                            .collect(Collectors.toList());

        System.out.println(output);


        IntStream.range(4, 11)
                .filter(v -> v%4 ==0)
                .forEach(System.out:: println);

    }


}
