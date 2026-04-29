package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(LALALA(15));
    }
    public static List<String> LALALA(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz || buzz) {
                if(fizz && buzz) result.add("FizzBuzz");
                else if (fizz) result.add("Fizz");
                else if (buzz) result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
