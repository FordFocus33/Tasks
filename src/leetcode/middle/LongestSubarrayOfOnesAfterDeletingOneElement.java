package leetcode.middle;

public class LongestSubarrayOfOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] mas = {1,1,1,1};
        System.out.println(longestSubarray(mas));
    }

    public static int longestSubarray(int[] mas) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;

        for (int right = 0; right < mas.length; right++) {
            if (mas[right] == 0) zeroCount++;

            while (zeroCount > 1) {
                if(mas[left] == 0) zeroCount--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
}
