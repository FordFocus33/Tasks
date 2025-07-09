import java.io.Console;
import java.io.IOException;
import java.util.*;

public class Main {

    // Function to calculate the maximum profit
    static long getMaximumProfit(long[] Arr, int n) {
        // Create a 2D array for dynamic programming with dimensions [n+1][2]
        long[][] dp = new long[n + 1][2];

        // Initialize the entire dp table with -1
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }
        // Base condition: If we have no stocks to buy or sell, profit is 0
        dp[n][0] = dp[n][1] = 0;

        long profit = 0;

        // Iterate through the array in reverse to calculate the maximum profit
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 0) { // We can buy the stock
                    profit = Math.max(dp[ind + 1][0], dp[ind + 1][1] - Arr[ind]);
                    System.out.println(dp[ind + 1][0] + " " + dp[ind + 1][1] + " " + Arr[ind]);
                }

                if (buy == 1) { // We can sell the stock
                    profit = Math.max(dp[ind + 1][1], Arr[ind] + dp[ind + 1][0]);
                    System.out.println(dp[ind + 1][1] + " " + Arr[ind] + " " + dp[ind + 1][0]);
                    System.out.println("-------------------");
                }

                dp[ind][buy] = profit;
            }
        }
        return dp[0][0]; // The maximum profit is stored at dp[0][0]
    }

    public static void main(String args[]) throws IOException {
        int n = 6;
        long[] Arr = {7, 1, 5, 3, 6, 4};

        // Calculate and print the maximum profit
        System.out.println("The maximum profit that can be generated is " + getMaximumProfit(Arr, n));
    }




//    public static int[] lalala(int[] arr) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(arr[i]);
//        }
//        int i = Integer.parseInt(sb.toString());
//
//        sb.delete(0, sb.length());
//        sb.append(i + 1);
//
//        char[] chars = sb.toString().toCharArray();
//        int[] res = new int[chars.length];
//        for (int j = 0; j < chars.length; j++) {
//            res[j] = Integer.parseInt(String.valueOf(chars[j]));
//        }
//        return res;
//    }
//
//    public static int[] listToIntArray(List<Integer> list) {
//        int[] array = new int[list.size()];
//
//        for (int i = 0; i < list.size(); i++) {
//            array[i] = list.get(i);
//        }
//
//        return array;
//    }
}