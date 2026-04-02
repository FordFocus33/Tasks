package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    /**
     * You are given a sorted unique integer array nums.
     *
     * A range [a,b] is the set of all integers from a to b (inclusive).
     *
     * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
     *
     * Each range [a,b] in the list should be output as:
     *
     *     "a->b" if a != b
     *     "a" if a == b
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [0,1,2,4,5,7]
     * Output: ["0->2","4->5","7"]
     * Explanation: The ranges are:
     * [0,2] --> "0->2"
     * [4,5] --> "4->5"
     * [7,7] --> "7"
     *
     * Example 2:
     *
     * Input: nums = [0,2,3,4,6,8,9]
     * Output: ["0","2->4","6","8->9"]
     * Explanation: The ranges are:
     * [0,0] --> "0"
     * [2,4] --> "2->4"
     * [6,6] --> "6"
     * [8,9] --> "8->9"
     */

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};

        System.out.println(getLost(nums));
    }

    public static List<String> getLost(int[] nums) {
        int first = -1;
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (first == -1) strings.add(String.valueOf(nums[i]));
                else strings.add(first + "->" + nums[i]);
            } else {
                if (first == -1) first = nums[i];
                if (nums[i] + 1 < nums[i + 1]) {
                    if (first == nums[i]) strings.add(String.valueOf(first));
                    else strings.add(first + "->" + nums[i]);
                    first = -1;
                }
            }
        }

        return strings;
    }
}
