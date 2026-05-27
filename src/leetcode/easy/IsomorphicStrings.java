package leetcode.easy;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String s1 = "title";
        System.out.println(isIsomorphic(s, s1));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() < t.length()) return false;
        HashMap<Character, Character> result = new HashMap<>();
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (result.containsKey(charsS[i]) && result.get(charsS[i]) != charsT[i]) {
                return false;
            }
            result.put(charsS[i], charsT[i]);

        }

        return true;
    }
}
