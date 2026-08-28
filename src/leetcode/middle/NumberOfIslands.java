package leetcode.middle;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','0','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','1'},
                {'0','0','0','0','0'}
        };
        System.out.println(neverLetMeRunAway(grid, 0, 0));
    }

    public static int neverLetMeRunAway(char[][] grid, int a, int b) {
        int count = 0;
        for (int i = a; i < grid.length; i++) {
            for (int j = b; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    iJustWannaSaidThankYouLord(grid, i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void iJustWannaSaidThankYouLord(char[][] grid, int a, int b) {
        if (a < 0 ||
            a >= grid.length ||
            b < 0 ||
            b >= grid[0].length) {
            return;
        }

        if (grid[a][b] == '0') {
            return;
        }

        grid[a][b] = '0';

        iJustWannaSaidThankYouLord(grid, a + 1, b);
        iJustWannaSaidThankYouLord(grid, a, b + 1);
        iJustWannaSaidThankYouLord(grid, a - 1, b);
        iJustWannaSaidThankYouLord(grid, a, b - 1);
    }
}
