package leetcode.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}
        };
        int rows = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        Stream.of(result).forEach(s -> System.out.println(Arrays.toString(s)));
    }
}
