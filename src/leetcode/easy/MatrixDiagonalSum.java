package leetcode.easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = { {1,2,3},
                        {4,5,6},
                        {7,8,9}
        };
        int sum = 0;
        int leftStepA = 0;
        int leftStepB = 0;
        int rightStepA = 0;
        int rightStepB = mat.length - 1;

        for (int i = 0; i < mat.length; i++) {
            if (!(leftStepB == rightStepB && leftStepA == rightStepA)) {
                int first = mat[leftStepA][leftStepB];
                int second = mat[rightStepA][rightStepB];
                sum += first + second;

            } else {
                sum += mat[leftStepA][leftStepB];
            }
            leftStepB++;
            leftStepA++;
            rightStepB--;
            rightStepA++;
        }
        System.out.println(sum);
    }
}
