package leetcode;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int removedValue = 3;

        System.out.println(removeElement(nums, removedValue));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
