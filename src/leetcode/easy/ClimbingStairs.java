package leetcode.easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStirs(8));
    }

    public static int climbStirs(int n) {
        if (n <= 2) return n;

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;

            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }
}
