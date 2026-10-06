package leetcode.middle;

public class TheMaze {

    public static void main(String[] args) {

        int[][] labirint = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        System.out.println(alorsOnDance(labirint, new int[]{0,0}, new int[]{4,2}));
    }

    public static boolean alorsOnDance(int[][] labirint, int[] start, int[] finish) {
        boolean[][] visited = new boolean[labirint.length][labirint[0].length];
        return movingGrooving(labirint, visited, start[0], start[1], finish);
    }

    public static boolean movingGrooving(int[][] labirint, boolean[][] visited, int x, int y, int[] finish) {
        if (visited[x][y]) return false;
        if (x == finish[0] && y == finish[1]) return true;
        visited[x][y] = true;
        int[][] directions = {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };

        for (int[] direction : directions) {
            int newX = x;
            int newY = y;

            while (newX + direction[0] >= 0 && newX + direction[0] < labirint.length &&
                    newY + direction[1] >= 0 && newY + direction[1] < labirint[0].length &&
                    labirint[newX + direction[0]][newY + direction[1]] == 0) {
                newX += direction[0];
                newY += direction[1];
            }

            if (movingGrooving(labirint, visited, newX, newY, finish)) return true;
        }
        return false;
    }

}
