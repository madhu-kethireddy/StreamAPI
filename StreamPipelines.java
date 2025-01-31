import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
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

        DoubleStream.iterate(2.3, i -> i + 0.2)
                    .limit(10)
                    .skip(2)
                    .forEach(n -> System.out.println(n));

        Stream.of(1,2,3,5,6).flatMap(x -> {
            switch (x%2) {
                case 0:
                    return Stream.of(x, x*x);
                case 1:
                    return Stream.of(0);
                default:
                    return Stream.of(100);                 
            }
        }).forEach(System.out::println);;


    }


}
