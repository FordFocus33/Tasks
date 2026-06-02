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
        int index = 0;
        int canBePosition = nums[0] > target ? 0 : nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                index = mid;
                right = mid - 1;
                canBePosition = mid;
            } else {
                left = mid + 1;
            }
        }

        if (index != -1 && nums[index] == target) return index;
        return canBePosition;
    }
}
