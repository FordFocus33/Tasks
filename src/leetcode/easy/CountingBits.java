package leetcode.easy;

import java.util.Arrays;

public class CountingBits {
    /**
     * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
     */

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countingBits(n)));
    }

    public static int[] countingBits(int n) {
        int[] res = new int[n + 1];
        System.out.println(5 & 1);
        // Начинаем с 1, т.к для 0 вся равно вернется 0, а new int и так заполняется нулями при объявлении.
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }


/**
 * Мой модный вариант. Медленный, но модный. Выше быстрый и побитовый
 */
//    public int[] countBits(int n) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            String[] a = Integer.toBinaryString(Integer.parseInt(String.valueOf(i))).split("");
//            result.add(calculate1(countingStars(a)));
//        }
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public List<Integer> countingStars(String[] strings) {
//        return Arrays.stream(strings)
//                .filter(s -> !s.equals("0"))
//                .map(Integer::parseInt)
//                .toList();
//    }
//
//    public int calculate1(List<Integer> list) {
//        return list.stream().mapToInt(Integer::intValue).sum();
//    }

}
