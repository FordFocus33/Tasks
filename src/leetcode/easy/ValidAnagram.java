package leetcode.easy;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "atc";
        String s1 = "cat";
        System.out.println(isAnagram(s, s1));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int a = map.get(c) + 1;
                map.put(c, a);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            int count = map.get(c) - 1;
            if (count < 0) return false;
            map.put(c, count);
        }

        return true;
    }
}
