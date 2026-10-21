package leetcode.middle;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[n];

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(
                    dp[i - 1],
                    dp[i - 2] + nums[i]
            );
        }

        return dp[n - 1];
    }
}
