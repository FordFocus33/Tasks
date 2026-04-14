package leetcode.easy;

/**
 * iven a positive integer num, return true if num is a perfect square or false otherwise.
 *
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 *
 * You must not use any built-in library function, such as sqrt.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 16
 * Output: true
 * Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(isPerfect(n));
    }

    public static boolean isPerfect(int num) {
        boolean result = false;
        if (num == 0) return result;
        result = checkProgress(num, 1);
        return result;
    }

    public static boolean checkProgress(int n, int b) {
        if (b * b > n) return false;
        else if (b * b == n) return true;
        else return checkProgress(n, ++b);
    }
}
