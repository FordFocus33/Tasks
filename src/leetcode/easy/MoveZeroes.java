package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        secondInterpretation(nums);
    }

    /**
     * Моё решенгие
     * @param nums
     */
    public static void firstInterpretation(int[] nums) {
        int limit = nums.length - 1;
        for (int i = limit; i >= 0; i--) {
            if (nums[i] == 0) {
                int step = i;
                while (step < limit) {
                    nums[step] = nums[step + 1];
                    nums[step + 1] = 0;
                    step++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Алгомонстер (более быстрое)
     * @param nums
     */
    public static void secondInterpretation(int[] nums) {
        int nonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = tmp;
                nonZero++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
