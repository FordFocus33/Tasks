package leetcode.easy;

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

 An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

 Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 */
public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,1,0};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length - 1];
        return a > b ? down(nums) : up(nums);
    }

    public static boolean up(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }
        return true;
    }

    public static boolean down(int[] nums) {
        for (int i = nums.length - 1; i > 0 ; i--) {
            if (nums[i] > nums[i - 1]) return false;
        }
        return true;
    }
}
