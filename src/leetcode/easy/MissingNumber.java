package leetcode.easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] mas = {9,6,4,2,3,5,7,0,1};
        System.out.println(mathMethod(mas));
    }

    /**
     * Способ решения математическим методом.
     * @param nums
     * @return
     */
    public static int mathMethod(int[] nums) {
        int length = nums.length;

        int res = length * (length + 1) / 2;

        for (int i = 0; i < length; i++) {
            res -= nums[i];
        }

        return res;
    }

    /**
     * Способ решения при помощи сортировки
     * @param nums
     * @return
     */
    public static int sortMethod(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }
}
