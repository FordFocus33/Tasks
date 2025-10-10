package streams;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prom {

    public static void flatMapExample() {
        String[] str = {"Java", "Ruuuusssshh"};
        Stream.of(str).map(s -> s.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::print);
    }

    public static void flatMapIntExample() {
        int[] mas = {1,2,0,3,4};
        Stream.of(mas).flatMapToInt(Arrays::stream).forEach(x -> IntStream.range(0, x).forEach(System.out::print));
        System.out.println();
        Stream.of(mas).flatMapToInt(Arrays::stream).sorted().forEach(System.out::print);
    }

    //Создаем тестовое условие и применяем его
    public static void exampleOfDropWhileTakeWhileAndPredicate() {
        int[] mas = {1,-2,0,3,-4};
        //Predicate
        IntPredicate predicate = x -> x > 0;
        Stream.of(mas).flatMapToInt(Arrays::stream).forEach(x -> System.out.print(predicate.test(x) + " "));

        System.out.println();
        //DropWhile
        Stream.of(mas).flatMapToInt(Arrays::stream).sorted().dropWhile(x -> x < 0).forEach(System.out::print);

        System.out.println();
        //takeWhile
        Stream.of(mas).flatMapToInt(Arrays::stream).sorted().takeWhile(x -> x < 0).forEach(System.out::print);
    }

    public static void exampleOfConcat() {
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");
        Stream.concat(people1, people2).forEach(System.out::print);
    }

    public static void main(String[] args) {
        flatMapExample();
    }
}
