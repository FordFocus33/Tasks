package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
       int[] a = {4,9,5};
       int[] b = {9,4,9,8,4};
        System.out.println(Arrays.toString(helloWorld(a, b)));
    }


    /**
     * Создаем массив. Берем выборку из 1001 числа. Если в первом массиве есть число, входящее в диапазон, отмечаем его
     * как true (т.е. seems[4] = true, значит, что число 4 есть в первом массиве).
     * Далее сравниваем с числами из 2 массива, если есть пересечения - заносим их в ArrayList.
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] helloWorld(int[] nums1, int[] nums2) {
        boolean[] seems = new boolean[1001];
        for (int nums : nums1) {
            seems[nums] = true;
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int nums : nums2) {
            if (seems[nums]) {
                list.add(nums);
                seems[nums] = false;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
