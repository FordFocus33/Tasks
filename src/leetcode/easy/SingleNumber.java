package leetcode.easy;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(findSingle(nums));
        System.out.println(findSingleByte(nums));
    }

    public static int findSingle(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.put(key, map.containsKey(key));
        }
        return map.entrySet().stream()
                .filter(k -> k.getValue().equals(false))
                .toList().getFirst().getKey();
    }

    /*
    Побитовое решение
     */

    public static int findSingleByte(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
