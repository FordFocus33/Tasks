package leetcode.middle;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        boolean[] duplicate = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (duplicate[nums[i]] == true) return nums[i];
            duplicate[nums[i]] = true;
        }

        return nums[nums.length - 1];
    }
}
