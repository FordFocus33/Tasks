package leetcode.easy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    /**
     * Алгоритм Бойера-Мура
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count++;
            } else {
                if (candidate == nums[i]) count++;
                else count--;
            }
        }

        return candidate;

    }
}
