package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int count = 2;
        System.out.println(Arrays.toString(rotate(arr, count)));
    }

    public static int[] rotate(int[] arr, int k) {
        int last = 0;
        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (j == arr.length - 1) {
                    last = arr[j];
                } else if (j == 0){
                    arr[j] = last;
                    break;
                }
                    arr[j] = arr[j - 1];

            }
        }
        return arr;
    }
}
