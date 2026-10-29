package leetcode.middle;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2};

        System.out.println(coinChange(coins,4));
    }

    public static int coinChange(int[] coins, int amount) {
        int n = amount + 1;
        int[] dp = new int[n];
        Arrays.fill(dp, n);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != n) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount];
    }
}
