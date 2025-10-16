package leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] position = {1,2,4,5};
        int target = 3;

        System.out.println(findPosition(position, target));
    }

    public static int findPosition(int[] mas, int target) {
        for (int i = 0; i < mas.length; i++) {
            if (target <= mas[i]) {
                return i;
            }
        }
        return mas.length;
    }
}
