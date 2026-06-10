package leetcode.middle;

import java.util.Arrays;

public class SortArray_Counting {
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,5};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int[] ints = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            ints[current] += 1;
        }

        int step = 0;
        for (int i = 0; i < ints.length; i++) {
            while (ints[i] > 0) {
                nums[step] = i;
                ints[i]--;
                step++;
            }
        }
        return nums;
    }
}
