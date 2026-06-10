package leetcode.middle;

import java.util.Arrays;

public class SortArray_Selection {
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,5};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int pos = i;
            int j = i;
            while (j < nums.length) {
                if (min > nums[j]) {
                    min = nums[j];
                    pos = j;
                }
                j++;
            }
            nums[pos] = nums[i];
            nums[i] = min;
        }
        return nums;
    }
}
