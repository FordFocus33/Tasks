package leetcode.middle;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharachters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(countOfLongest(s));
    }

    public static int countOfLongest(String s) {
        int left = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                max = Math.max(max, set.size());
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
        }
        return Math.max(max, set.size());
    }
}
