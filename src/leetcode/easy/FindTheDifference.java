package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char[] sChars = new char[30];
        char[] tChars = new char[30];
        char result = 0;

        for (int i = 0; i < s.length(); i++) {
            sChars[i] = s.toCharArray()[i];
        }
        for (int i = 0; i < t.length(); i++) {
            tChars[i] = t.toCharArray()[i];
        }
        for (int i = 0; i < tChars.length; i++) {
            result ^= (char) (sChars[i] ^ tChars[i]);
        }
        return result;
    }

    /**
     * Альтернатива через Collection
     * @param s
     * @param t
     * @return
     */
    public static char findDifference(String s, String t) {
        List<Character> set = t.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        char[] mas = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            set.remove(Character.valueOf(mas[i]));
        }
        return set.stream().findFirst().get();
    }
}
