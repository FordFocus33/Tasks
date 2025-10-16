package leetcode;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1,3};
//        int[] nums = {5,7,7,8,8,10};
        int target = 1;

        System.out.println(Arrays.toString(findFirstAndLast(nums, target)));
    }

    public static int[] findFirstAndLast(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && first == -1) {
                first = i;
                last = i;
            } else if (nums[i] == target && first != -1) {
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
