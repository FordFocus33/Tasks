package leetcode.middle;

public class JumpGame {
    public static void main(String[] args) {
        int[] mas = {2,3,1,1,4};
//        int[] mas = {3,2,1,0,4};
        System.out.println(jumpGame(mas));
    }

    public static boolean jumpGame(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;

            maxReach = Math.max(nums[i] + i, maxReach);

            if (maxReach >= nums.length - 1) return true;
        }
        return true;
    }
}
