package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ternar {

    public static void exampleCount() {
        int[] mas = {1,-2,0,3,-4};
        System.out.println(Stream.of(mas).flatMapToInt(Arrays::stream).count());
    }

    public static void exampleReduce() {
        int[] mas = {1,2,3,4};
//        System.out.println(Stream.of(mas).flatMapToInt(Arrays::stream).reduce(Integer::sum));
        //Тут к общей сумме добавится 10, то есть 10 + 10(сумма эл. массива)
        System.out.println(Stream.of(mas).flatMapToInt(Arrays::stream).reduce(10, Integer::sum));
    }

    public static void main(String[] args) {
        exampleReduce();
    }
}
