package leetcode.middle;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
//        int[][] matrix = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}};
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length;
        int down = matrix.length;
        int up = 0;

        for (int i = 0; i < right; i++) {
            result.add(matrix[left][i]);
        }
        left++;
        for (int i = 1; i < down; i++) {
            result.add(matrix[i][right - 1]);
        }
        right--;
        down--;
        for (int i = right - 1; i >= 0; i--) {
            if (matrix[0].length == matrix.length) {
                result.add(matrix[right][i]);
            } else {
                result.add(matrix[right - 1][i]);
            }
        }
        for (int i = down - 1; i > up; i--) {
            result.add(matrix[i][up]);
        }
        for (int i = left; i < right; i++) {
            result.add(matrix[left][i]);
        }

        System.out.println(result);

    }
}
