package leetcode.middle;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] shnell = {1};
        System.out.println(maxSubArray(shnell));
    }

    public static int maxSubArray(int[] mass) {
        int current = mass[0];
        int max = mass[0];

        for (int i = 1; i < mass.length; i++) {
            current = Math.max(mass[i], current + mass[i]);
            max = Math.max(max, current);
        }

        return max;
    }
}
