package leetcode;

public class NumbersOfIslands {
    public static void main(String[] args) {
//        char[][] grid = {      {'1','1','1','1','0'},
//                              {'1','1','0','0','0'},
//                              {'0','0','0','1','0'},
//                              {'1','0','1','0','0'}};

//        char[][] grid = {       {'1','1','1'},
//                                {'0','1','0'},
//                                {'1','1','1'}};

        char[][] grid = {       {'1','0','1','1','1'},
                                {'1','0','1','0','1'},
                                {'1','1','1','0','1'}};
        hello(grid);
    }

    public static void hello(char[][] grid) {
      int isLand = 0;
      int x = grid[0].length;
      int y = grid.length;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (grid[i][j] == '1') {
                    isLand++;
                    changeNeighboursToZero(grid, i, j, x, y);
                }
            }
        }

        System.out.println(isLand);
    }
    public static void changeNeighboursToZero(char[][] grid, int a, int b, int x, int y) {
                if (grid[a][b] == '1') {
                    grid[a][b] = '0';
                    if (y-1 != a) changeNeighboursToZero(grid, a+1, b, x, y);
                    if (a-1 >= 0) changeNeighboursToZero(grid, a-1, b, x, y);
                    if (x-1 != b) changeNeighboursToZero(grid, a, b+1, x, y);
                    if (b-1 >= 0) changeNeighboursToZero(grid, a, b-1, x, y);
                }
    }
}
