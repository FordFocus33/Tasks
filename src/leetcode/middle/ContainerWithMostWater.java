package leetcode.middle;


public class ContainerWithMostWater {
    static int maxWater(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int current = Math.min(height[left], height[right]);
            int distance = right - left;
            max = Math.max(max, current * distance);
            if (height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(maxWater(arr));
    }
}
