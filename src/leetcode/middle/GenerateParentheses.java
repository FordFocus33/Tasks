package leetcode.middle;

import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParentheses(3));
    }

    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0,0, n);
        return result;
    }

    public static void backtrack(List<String> result, StringBuilder sb, int open, int close, int n) {
        if (sb.length() == n * 2) {
            result.add(sb.toString());
            return;
        }
        /*
          В конце условий удаляем последний добавленный символ, чтобы ответ был из всевозможных комбинаций символов,
          а не ((()))
         */
        if (open < n) {
            sb.append('(');
            backtrack(result, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            backtrack(result, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
