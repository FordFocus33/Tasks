package leetcode.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for (Integer current : nums) {
            if (uniqueIndex == 0 || current != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = current;
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

//    Более быстрый вариант
//int[] nums = {1,1,2,2,3};
//    int remember = nums[0];
//    int step = 1;
//
//        for (int i = 0; i < nums.length; i++) {
//        if (nums[i] > remember) {
//            nums[step] = nums[i];
//            remember = nums[i];
//            step++;
//        }
//    }
}
