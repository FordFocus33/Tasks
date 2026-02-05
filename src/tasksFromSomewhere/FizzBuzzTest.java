package tasksFromSomewhere;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Реализовать функцию fizzbuzz.
 * Массив формируется по следующим правилам:
 *
 * Функция принимает аргумент в виде целого числа
 * Если число кратно трем, то в массив заносим слово Fizz
 * Если число кратно пяти, то в массив заносим слово Buzz
 * Если число кратно и трем и пяти, то в массив заносим слово FizzBuzz
 * Если число не кратно ни одному из этих чисел, то необходимо выбросить IllegalArgumentException
 *
 * Покрыть код тестами (в отдельном файле)
 */
public class FizzBuzzTest {
    public static void main(String[] args) {
        System.out.println(new String(hello(15), StandardCharsets.UTF_8));
    }

    public static byte[] hello(int n) {
        String result = "";
        if (n % 3 == 0) result += "FIZZ";
        if (n % 5 == 0) result += "BUZZ";
        if (result.isEmpty()) throw new IllegalArgumentException();

        return result.getBytes();
    }
}
