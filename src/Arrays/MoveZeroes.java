package Arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] mas = {0,1,0,4,3,3,12,0};
        hello(mas);
    }

    public static void hello(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            if (mas[i - 1] == 0 && mas[i] != 0) {
                mas[i - 1] = mas[i];
                mas[i] = 0;
                i = mas.length;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
