package leetcode.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(countLastWordLength(s));
    }

    public static Integer countLastWordLength(String s) {
        String[] strings = s.strip().split(" ");

        return strings[strings.length - 1].length();
    }
}
