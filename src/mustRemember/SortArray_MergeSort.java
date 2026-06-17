package mustRemember;

import java.util.Arrays;

public class SortArray_MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,8,11,-1,3};
        System.out.println(Arrays.toString(sortArray(nums)));
    }


    public static int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;

        int n = nums.length / 2;

        int[] left = Arrays.copyOfRange(nums, 0, n);
        int[] right = Arrays.copyOfRange(nums, n, nums.length);

        left = sortArray(left);
        right = sortArray(right);

        return superSortArray(left, right);
    }

    public static int[] superSortArray(int[] left, int[] right) {
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
