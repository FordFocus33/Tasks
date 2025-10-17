package leetcode.hard;

import java.util.List;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] first = {1,3};
        int[] second = {2};
        fernandoMartines(first, second);
    }
    public static void fernandoMartines(int[] nums1, int[] nums2) {
        List<Integer> list = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2))
                .boxed()
                .sorted()
                .toList();
        boolean isEven = list.size() % 2 == 0;
        double result;
        System.out.println(list);
        int position = list.size() / 2;
        if (!isEven) {
            result = list.get(position);
        } else {
            int firstNum = list.get(position);
            int secondNum = list.get(position - 1);
            result = (Double.parseDouble(String.valueOf(firstNum)) + Double.parseDouble(String.valueOf(secondNum))) / 2;
        }
        System.out.println(result);
    }
}
