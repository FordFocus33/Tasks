package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] mas = {1,-5,-8,99,42,-11,80,7,3};

        for (int i = 1; i < mas.length; i++) {
            int j = i - 1;
            int key = mas[i];

            while (j >= 0 && mas[j] > key) {
                mas[j + 1] = mas[j];
                j--;
            }
            mas[j + 1] = key;
        }

        System.out.println(Arrays.toString(mas));
    }
}
