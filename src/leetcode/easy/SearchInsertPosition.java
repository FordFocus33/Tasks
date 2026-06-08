package leetcode.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastVisit = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int index = nums[mid];
            if (index == target) {
                return mid;
            }
            if (index > target) {
                right = mid - 1;
            } if (index < target) {
                left = mid + 1;
                lastVisit = left;
            }
        }
        return Math.max(lastVisit, 0);
    }
}
