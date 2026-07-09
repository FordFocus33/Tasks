package leetcode.middle;

import java.util.*;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
//        int[] nums = {-1,0,-1,0,-1,0,-1};
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }
        int max = 0;
        ArrayList<Integer> keysList = new ArrayList<>(map.keySet());
        Collections.sort(keysList);
        int prev = keysList.get(0);
        for (int i = 1; i < keysList.size(); i++) {
            int current = keysList.get(i);
            if (prev + 1 == current) {
                max = Math.max(max, map.get(current) + map.get(prev));
            }
            prev = current;
        }

        return max;
    }
}
