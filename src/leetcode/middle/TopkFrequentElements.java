package leetcode.middle;

import java.util.*;
import java.util.stream.Collectors;

public class TopkFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,2,2,3,3,3,3,};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }


    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            map.merge(i, 1, Integer::sum);
        }
        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> a,
                        LinkedHashMap::new
                ));
        int[] result = new int[k];
        List<Integer> list = sorted.keySet().stream().toList();
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }


//    Вариант, который не учитывает отрицательные числа
//    public static int[] topKFrequent(int[] nums, int k) {
//        int[] supernatural = new int[1001];
//        for (int i = 0; i < nums.length; i++) {
//            int current = nums[i];
//            supernatural[current] += 1;
//        }
//        int[] result = new int[k];
//        int max = 0;
//        int maxPos = 0;
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < supernatural.length; j++) {
//                if (supernatural[j] > max) {
//                    maxPos = j;
//                    max = supernatural[j];
//                }
//            }
//            result[i] = maxPos;
//            supernatural[maxPos] = 0;
//            maxPos = 0;
//            max = 0;
//        }
//        return result;
//    }
}
