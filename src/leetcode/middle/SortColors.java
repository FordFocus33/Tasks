package leetcode.middle;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

    public static int[] sortColors(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        left = sortColors(left);
        right = sortColors(right);

        return finalSort(left, right);
    }

    public static int[] finalSort(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int step = 0;
        int[] result = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[step++] = left[i++];
            } else {
                result[step++] = right[j++];
            }
        }
        while (i < left.length) {
            result[step++] = left[i++];
        }

        while (j < right.length) {
            result[step++] = right[j++];
        }

        return result;
    }
}
