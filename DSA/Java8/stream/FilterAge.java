package Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAge {

    public static void main(String[] args) {

        // Predicate functional Interface

        System.out.println(    Arrays.asList(11, 22, 23, 13, 14, 55, 44, 21, 66, 10, 9, 8, 5).stream().filter(i->i>=18).collect(Collectors.toList()));


        // Consumer Functional interface

        Arrays.asList(1,2,3,4,5,6).stream().forEach(i-> System.out.print(i+" "));
        System.out.println();

        // function interface

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5).stream().map(i -> i * i).toList();
        System.out.println(list);
        System.out.println();

        // supply interface

        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);

        Stream<Double> generate = Stream.generate(() -> Math.random());
        Stream<Double> limit = generate.limit(10);
        Stream<Double> doubleStream = limit.map(limit1 -> limit1 + 10);
        doubleStream.forEach(System.out::println);

        

    }
}
