package leetcode.middle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
    private List<List<Integer>> result = new ArrayList<>();

    private List<Integer> currentSubset = new ArrayList<>();

    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        backtrack(0);
        return result;

    }

    private void backtrack(int index) {
        if (index == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }
        backtrack(index + 1);

        currentSubset.add(nums[index]);
        backtrack(index + 1);

        currentSubset.remove(currentSubset.size() - 1);
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        int[] nums = {1,2,3};
        System.out.println(subsets.subsets(nums));
    }
}
