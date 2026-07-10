package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrace(result, new ArrayList<>(), used, nums);
        return result;
    }

    public static void backtrace(List<List<Integer>> result,
                                                List<Integer> current,
                                                boolean[] used,
                                                int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            backtrace(result, current, used, nums);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
