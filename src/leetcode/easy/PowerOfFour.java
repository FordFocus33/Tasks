package leetcode.easy;

public class PowerOfFour {

    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     *
     * An integer n is a power of four, if there exists an integer x such that n == 4x.
     * @param args
     */
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        boolean result = false;
        if (n == 1) result = true;
        else if (n % 4 == 0)  result = isPowerOfFour(n / 4);
        return result;
    }
}
