package leetcode.middle;

import java.util.*;

public class LongestReplacingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 1;
        System.out.println(helloWorld(s, k));
    }

    public static int helloWorld(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(
                    maxFreq,
                    count[s.charAt(right) - 'A']
            );
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
