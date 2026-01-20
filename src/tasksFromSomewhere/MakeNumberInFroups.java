package tasksFromSomewhere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Дан список интов, повторяющихся элементов в списке нет.
 * Нужно преобразовать это множество в строку, сворачивая соседние по числовому ряду числа в диапазоны.
 * Примеры:
 * [1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
 * [1,4,3,2] => "1-4"
 * [1,4] => "1,4"
 */
public class MakeNumberInFroups {
    public static void main(String[] args) {
        int[] a = {1,4,5,2,3,9,8,11,0};
        lushLife(a);
    }

    public static void lushLife (int[] a) {
        HashSet<Integer> set = new HashSet();
        Arrays.stream(a).forEach(set::add);

        ArrayList<Integer> list = new ArrayList<>(set);

        int tail = list.getFirst();
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        String resultText = "";
        while (i < list.size()) {
            if (i + 1 < list.size()) {
                if (list.get(i + 1) - list.get(i) == 1) {
                    i++;
                } else {
                    if (tail == list.get(i)) {
                        resultText = String.valueOf(tail);
                    } else {
                        resultText = tail + "-" + list.get(i);
                    }
                    result.add(resultText);
                    tail = list.get(i + 1);
                    i++;
                }
            } else {
                if (tail != list.get(i)) {
                    resultText = tail + "-" + list.get(i);
                } else {
                    resultText = String.valueOf(list.get(i));
                }
                result.add(resultText);
                i++;
            }
        }
        System.out.println(list);
        System.out.println(result);
    }

    // Вариант от гптхи
    // List<String> result = new ArrayList<>();
    //IntStream.of(a)
    //        .distinct()
    //        .sorted()
    //        .forEachOrdered(new IntConsumer() {
    //            Integer start = null, prev = null;
    //
    //            @Override
    //            public void accept(int curr) {
    //                if (start == null) {
    //                    start = prev = curr;
    //                } else if (curr == prev + 1) {
    //                    prev = curr;
    //                } else {
    //                    result.add(start.equals(prev)
    //                            ? start.toString()
    //                            : start + "-" + prev);
    //                    start = prev = curr;
    //                }
    //            }
    //        });
    //
    //result.add(result.getLast());
}
