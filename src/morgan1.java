import java.util.*;

public class morgan1 {
    public static int cnt = 0;

    public static void main(String[] args) {
        // int[][] grid = { { 9, 7, 9 }, { 6, 6, 1 }, { 4, 3, 2 } };

        int[][] grid = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };

        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j]) {
                    cnt = 0;
                    ans = Math.max(dfs(hs, grid, i, j, visited, -1), ans);
                }
            }
        }
        System.out.println(ans);
    }

    public static int dfs(HashSet<Integer> hs, int[][] grid, int i, int j, boolean[][] visited, int prev) {
        if (i >= grid.length || j >= grid[0].length || j < 0 || i < 0) {
            return 0;
        }

        if (visited[i][j] || grid[i][j] == prev) {
            return 0;
        }

        if (hs.contains(grid[i][j])) {
            return 0;
        }
        cnt++;
        hs.add(grid[i][j]);
        dfs(hs, grid, i + 1, j, visited, grid[i][j]);
        dfs(hs, grid, i - 1, j, visited, grid[i][j]);
        dfs(hs, grid, i, j + 1, visited, grid[i][j]);
        dfs(hs, grid, i, j - 1, visited, grid[i][j]);

        return cnt;
    }
}
