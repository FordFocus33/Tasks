package arrays;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] mas = {9,9,9};
        int length = mas.length;
        int count = length - 1;

        while (count >= 0) {
            if (mas[count] + 1 == 10) {
                mas[count] = 0;
            } else {
                mas[count] = mas[count] + 1;
                return;
            }
            count--;
        }
        int[] result = new int[length + 1];
        result[0] = 1;
        for (int i = 0; i < length; i++) {
            result[i + 1] = mas[i];
        }

        System.out.println(Arrays.toString(result));
    }

}
