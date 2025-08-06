package Else;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class PutBrackets {

    /**
     * Условие: написать метод boolean isValid(String s)
     * который будет проверять правильность расстановки скобок, строка может содержать скобки () [] {}
     * Пример:
     * () - true
     * ({}) - true
     * ({) - false
     * ((( - false
     *
     * @param args
     */

    public static void main(String[] args) {
        String s1 = "(([]}))";
        String s2 = "{(}";
        String s3 = "{";
        String s4 = "{[]}";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }

    public static boolean isValid(String brackets) {
        HashSet<Character> plusSet = new HashSet<>();
        HashSet<Character> minusSet = new HashSet<>();

        plusSet.add('{');
        plusSet.add('(');
        plusSet.add('[');

        minusSet.add('}');
        minusSet.add(')');
        minusSet.add(']');

        int result = 0;

        for (char s : brackets.toCharArray()) {
            if (plusSet.contains(s)) result++;
            else if (minusSet.contains(s)) result--;
        }

        return result == 0;
    }
}
