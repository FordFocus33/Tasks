package leetcode.middle;

import java.util.Arrays;

public class SortArray_Insert {
    //Сортировка вставками

    public static void main(String[] args) {
        int[] nums = {3,2,1,5};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        return nums;
    }
}
