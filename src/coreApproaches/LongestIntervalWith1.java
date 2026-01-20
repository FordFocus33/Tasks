package coreApproaches;

/**
 *     Дан массив из нулей и единиц. [0, 0, 1, 1, 0, 1, 1, 0]
 *     Нужно определить, какой максимальный по длине подинтервал единиц можно получить, удалив ровно один элемент массива.
 *     [1, 1, 0]
 *
 *
 *     Тут идет проверка соседей слева и справа. Как это решать
 */
public class LongestIntervalWith1 {
    public static void main(String[] args) {
        int[] mas = {0, 0, 1, 1, 0, 1, 1, 0};
        System.out.println(longest(mas));
    }

    public static int longest(int[] mas) {
        int left = 0;      // количество единиц слева от нуля
        int right = 0;     // количество единиц справа от нуля
        int max = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 1) {
                right++;
            } else {
                // встретили 0 → считаем, что мы его превращаем в 1
                max = Math.max(max, left + 1 + right);
                left = right;
                right = 0;
            }
        }

        // случай, когда последний элемент — 1
        max = Math.max(max, left + 1 + right);

        return max;
    }
}

