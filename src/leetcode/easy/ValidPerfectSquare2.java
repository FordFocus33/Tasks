package leetcode.easy;

public class ValidPerfectSquare2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long pow = (long) mid * mid;
            if (pow > num) {
                right = mid - 1;
            } if (pow < num) {
                left = mid + 1;
            } if (pow == num) return true;
        }
        return false;
    }
}
