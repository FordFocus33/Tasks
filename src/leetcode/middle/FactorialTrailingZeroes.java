package leetcode.middle;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(24));
    }

    public static int trailingZeroes(int n) {
        int result = 0;

        while (n > 0) {
            n /= 5;
            result += n;
        }

        return result;
    }
}
