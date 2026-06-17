package mustRemember;

import java.util.Arrays;

public class SortArray_Insertion {
    public static void main(String[] args) {
        int[] nums = {1,8,11,-1,3};
        System.out.println(Arrays.toString(sortArray(nums)));
    }


    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int k = i - 1;
            int interim = nums[i];
            while (k >= 0 && interim < nums[k]) {
                nums[k + 1] = nums[k];
                nums[k] = interim;
                k--;
            }
        }
        return nums;
    }
}
