package leetcode;

public class NumbersOfIslands {
    public static void main(String[] args) {
        char[][] grid = {      {'1','1','1','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','1','0'},
                {'1','0','1','0','0'}};

//        char[][] grid = {       {'1','1','1'},
//                                {'0','1','0'},
//                                {'1','1','1'}};
//
//        char[][] grid = {       {'1','0','1','1','1'},
//                {'1','0','1','0','1'},
//                {'1','1','1','0','1'}};

        int x = grid[0].length;
        int y = grid.length;

        hello(grid, x, y);
    }

    public static void hello(char[][] mas, int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (mas[i][j] == '1') {
                    result++;
                    transformer(mas, x, y, i, j);
                }
            }
        }
        System.out.println(result);
    }

    public static void transformer(char[][] mas, int x, int y, int i, int j) {
        if (mas[i][j] == '1') {
            mas[i][j] = '0';
            if (i + 1 < y) transformer(mas, x, y, i + 1, j);
            if (j + 1 < x) transformer(mas, x, y, i, j + 1);
            if (i - 1 >= 0) transformer(mas, x, y, i - 1, j);
            if (j - 1 >= 0) transformer(mas, x, y, i, j - 1);
        }
    }
}
