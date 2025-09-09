package arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,11,7,15};
        System.out.println(Arrays.toString(hello(arr, 9)));
    }

    public static int[] hello(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;
                if (arr[j] + arr[i] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }

}
