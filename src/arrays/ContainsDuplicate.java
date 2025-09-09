package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println((Arrays.toString(new boolean[]{containsDuplicate(nums)})));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(i);
                return set.contains(nums[i]);
            }
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
