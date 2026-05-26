package leetcode.middle;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int[] result = new int[2];
        int target = 6;

        for (int i = 0; i < numbers.length; i++) {
            int secondOne = target - numbers[i];
            int step = 0;
            while (step < numbers.length) {
                if (step != i && numbers[step] == secondOne) {
                    result[0] = step + 1;
                    result[1] = i + 1;
                    break;
                }
                step++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
