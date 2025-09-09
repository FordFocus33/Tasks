package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,5,6,7,8};
        int[] arr2 = {2,2,5,1};
        System.out.println(intersect(arr, arr2));
    }

    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        while (true) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        result.add(nums1[i]);
                        nums1[i] = nums2[j] = -1;
                        break;
                    }
                }
            }
            break;
        }

        return result;
    }
}
