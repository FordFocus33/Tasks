package leetcode.easy;

import java.util.ArrayDeque;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        ArrayDeque<Character> agree = new ArrayDeque<>();
        agree.push('(');
        agree.push('{');
        agree.push('[');

        for (Character c : s.toCharArray()) {
            if (agree.contains(c)) {
                stack.push(c);
            } else {
                if (!isCorrectClosed(c, stack)) return false;
                stack.peek();
            }
        }
        return stack.isEmpty();
    }

    public static boolean isCorrectClosed(Character c, ArrayDeque<Character> stack) {
        if (stack.isEmpty()) return false;

        boolean isSkobka = c.equals(')');
        boolean isFigSkobka = c.equals('}');
        boolean isKvSkobka = c.equals(']');

        if (isSkobka) {
            return stack.pop().equals('(');
        } if (isFigSkobka) {
            return stack.pop().equals('{');
        } if (isKvSkobka) {
            return stack.pop().equals('[');
        }
        return false;
    }
}
