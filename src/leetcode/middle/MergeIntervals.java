package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Ключевая формула a <= d && b >= c
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4}, {0,3}};
        intervals = merge(intervals);
        for (int i = 0; i < intervals.length; i++) {
            System.out.print(intervals[i][0] + ",");
            System.out.println(intervals[i][1]);
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for (int j = 0; j < intervals.length; j++) {
                if (i != j) {
                    int c = intervals[j][0];
                    int d = intervals[j][1];

                    if (a <= d && b >= c) {
                        a = Math.min(a, c);
                        b = Math.max(b,d);

                        intervals[j][0] = -1;
                        intervals[j][1] = -1;
                    }
                }
            }
            if (a >= 0) result.add(new int[]{a,b});
        }
        return result.toArray(new int[1][]);
    }
}
