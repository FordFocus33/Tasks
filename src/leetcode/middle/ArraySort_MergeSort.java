package leetcode.middle;

import java.util.Arrays;

public class ArraySort_MergeSort {
    //Сортировка слиянием (ТОП по скорости)
    public static void main(String[] args) {
        int[] nums = {1,8,11,-1,3};
        System.out.println(Arrays.toString(sortArray(nums)));
    }


    public static int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        left = sortArray(left);
        right = sortArray(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int a = 0;
        int b = 0;
        int step = 0;
        int[] result = new int[left.length + right.length];

        while (a < left.length && b < right.length) {
            if (left[a] < right[b]) {
                result[step++] = left[a++];
            } else {
                result[step++] = right[b++];
            }
        }
        while (a < left.length) {
            result[step++] = left[a++];
        }
        while (b < right.length) {
            result[step++] = right[b++];
        }
        return result;
    }
}
