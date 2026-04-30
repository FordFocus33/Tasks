package leetcode.easy;

import java.util.Arrays;

public class SquaresOfaSortedArray {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int[] result = new int[n];
        int position = n - 1;

        while (left <= right) {
            int leftSquare = (int) Math.pow(nums[left], 2);
            int rightSquare = (int) Math.pow(nums[right], 2);

            if (leftSquare > rightSquare) {
                result[position] = leftSquare;
                left++;
            } else {
                result[position] = rightSquare;
                right--;
            }
            position--;
        }
        return result;
    }
}
