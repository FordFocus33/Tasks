package leetcode.easy;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 *
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
public class PowerOfThree {

    public static void main(String[] args) {
        int n = 27;
        System.out.println(calculatePower(n));
    }

    public static boolean calculatePower(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        boolean result = false;
        if (n % 3 == 0) {
            result = calculatePower(n / 3);
        }

        return result;
    }
}
