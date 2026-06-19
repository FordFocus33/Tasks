package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class InsertInterval {
    public static void main(String[] args) {
     int[][] interval = {{1,5}};
     int[] newInterval = {0,0};
     interval = insert(interval, newInterval);
        for (int i = 0; i < interval.length; i++) {
            System.out.print(interval[i][0] + ", ");
            System.out.println(interval[i][1]);
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();
        boolean isMer = false;

        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            if (isMerged(new int[]{a,b}, newInterval)) {
                a = Math.min(a, newInterval[0]);
                b = Math.max(b, newInterval[1]);
                isMer = true;
            }
            for (int j = 0; j < intervals.length; j++) {
                if (i != j) {
                    if (isMerged(new int[]{a,b}, intervals[j])) {
                        a = Math.min(a, intervals[j][0]);
                        b = Math.max(b, intervals[j][1]);

                        intervals[j][0] = -1;
                        intervals[j][1] = -1;
                    }
                }
            }
            if (a >= 0) result.add(new int[]{a,b});
        }
        if (!isMer) result.add(newInterval);
        int[][] resMas = result.toArray(new int[1][]);
        Arrays.sort(resMas, Comparator.comparingInt(x -> x[0]));
        return resMas;
    }

    public static boolean isMerged(int[] left, int[] right) {
        if (left[0] <= right[1] && left[1] >= right[0]) {
            return true;
        }
        return false;
    }
}
