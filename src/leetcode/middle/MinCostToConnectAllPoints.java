package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;

public class MinCostToConnectAllPoints {
    public static void main(String[] args) {
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        System.out.println(whyDoesItFeelSoGood(points));
    }

    public static int whyDoesItFeelSoGood(int[][] points) {
        int n = points.length;
        int[] minSum = new int[n];
        boolean[] visited = new boolean[5];

        Arrays.fill(minSum, Integer.MAX_VALUE);
        minSum[0] = 0;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int current = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (current == -1 || minSum[current] > minSum[j])) {
                    current = j;
                }
            }
            visited[current] = true;
            totalSum += minSum[current];
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    int currentSum = glamorous(points[j], points[current]);
                    minSum[j] = Math.min(currentSum, minSum[j]);
                }
            }
        }
        return totalSum;
    }

    public static int glamorous(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}
