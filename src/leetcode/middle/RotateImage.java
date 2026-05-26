package leetcode.middle;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateImage {
    public static void main(String[] args) {
        int[][] mas = {{1,2,3},{4,5,6},{7,8,9}};

        int a = 0;

        Stream.of(mas).forEach(s -> System.out.println(Arrays.toString(s)));
        System.out.println("----------");
        while (a < mas.length - 1) {
            for (int i = a; i < mas.length; i++) {
                int interim = mas[a][i];
                mas[a][i] = mas[i][a];
                mas[i][a] = interim;
            }
            a++;
        }
        int left = 0;
        int right = mas.length - 1;
        while (left < right) {
            for (int i = 0; i < mas.length; i++) {
                int interim = mas[i][left];
                mas[i][left] = mas[i][right];
                mas[i][right] = interim;
            }
            left++;
            right--;
        }

        Stream.of(mas).forEach(s -> System.out.println(Arrays.toString(s)));
    }
}
