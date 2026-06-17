package leetcode.middle;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findElement(nums, k));
    }

    public static int findElement(int[] nums, int k) {
        nums = splitMas(nums);
        int currentNumber = nums.length - k;
        return nums[currentNumber];
    }

    public static int[] splitMas(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        left = splitMas(left);
        right = splitMas(right);

        return sortMas(left, right);
    }

    public static int[] sortMas(int[] left, int[] right) {
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
