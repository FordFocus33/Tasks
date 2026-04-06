package leetcode.easy;

import java.util.HashSet;

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 *     Starting with any positive integer, replace the number by the sum of the squares of its digits.
 *     Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 *     Those numbers for which this process ends in 1 are happy.
 *
 * Return true if n is a happy number, and false if not.
 * Example 1:
 *
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        HashSet<Integer> set = new HashSet<>();
        System.out.println(isHappy2(n, set));
    }

    public static boolean isHappy2(int n, HashSet<Integer> set) {
        boolean result = false;
        if (n == 1) result = true;
        else if (set.contains(n)) return false;
        else {
            set.add(n);
            int count = 0;
            for (char c : String.valueOf(n).toCharArray()) {
                count += (int) Math.pow(c - '0', 2);
            }
           result = isHappy2(count, set);
        }
        return result;
    }
}
