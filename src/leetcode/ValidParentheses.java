package leetcode;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        System.out.println(s.isEmpty());
    }
}
