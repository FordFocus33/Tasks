package arrays;

import java.util.HashSet;

/**
 *
 * Given a string s, find the length of the longest
 *
 * without duplicate characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(result(s));
    }

    public static int result(String s) {
        if (s.length() <= 1) return s.length();
        int result = 0;
        int interimsum = 0;
        HashSet<String> interim = new HashSet<>();
        int countOfCycles = 0;
        while (countOfCycles < s.length()) {
            for (int i = countOfCycles; i < s.length(); i++) {

                char c = s.charAt(i);
                if (interim.contains(String.valueOf(c))) {
                    if (interim.size() > result) {
                        result = interimsum;
                    }
                    interim.clear();
                    interimsum = 0;
                }
                interim.add(String.valueOf(c));
                interimsum++;
            }
            if (interimsum > result) result = interimsum;
            countOfCycles++;
            interimsum = 0;
            interim.clear();
        }
        return Math.max(interimsum, result);
    }

    /**
     * Я считаю, что это считается)
     */
}
