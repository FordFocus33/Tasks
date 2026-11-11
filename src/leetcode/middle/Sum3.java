package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(womanizer(nums));
    }
    public static List<List<Integer>> womanizer(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // 1. Сортируем массив
        Arrays.sort(nums);

        // 2. По очереди выбираем первый элемент тройки
        for (int i = 0; i < nums.length - 2; i++) {

            // Пропускаем одинаковые значения первого элемента
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 3. Два указателя для поиска остальных двух чисел
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    // Нашли подходящую тройку
                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    // Передвигаем оба указателя
                    left++;
                    right--;

                    // Пропускаем повторяющиеся значения
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
