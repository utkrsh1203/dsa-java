
public class morgan {

    public static int traverse(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int maxCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int count = dfs(grid, visited, i, j, Integer.MIN_VALUE);
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }

    private static int dfs(int[][] grid, boolean[][] visited, int i, int j, int prev) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] <= prev) {
            return 0;
        }

        visited[i][j] = true;
        int count1 = dfs(grid, visited, i + 1, j, grid[i][j]);
        int count2 = dfs(grid, visited, i - 1, j, grid[i][j]);
        int count3 = dfs(grid, visited, i, j + 1, grid[i][j]);
        int count4 = dfs(grid, visited, i, j - 1, grid[i][j]);
        visited[i][j] = false;

        return 1 + Math.max(Math.max(count1, count2), Math.max(count3, count4));
    }

    // public static void main(String[] args) {
    // // int[][] grid = { { 3, 4, 5 }, { 3, 2, 6 }, { 2, 2, 1 } };
    // int[][] grid = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };

    // int maxCount = traverse(grid);
    // System.out.println("Max number of elements that can be traversed: " +
    // maxCount);
    // }
}
