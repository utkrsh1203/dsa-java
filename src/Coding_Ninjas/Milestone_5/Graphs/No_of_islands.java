package Coding_Ninjas.Milestone_5.Graphs;

public class No_of_islands {
    public int numIslands(char[][] grid) {

        char[][] visited = new char[grid.length][grid[0].length];

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                visited[i][j] = '0';
            }
        }

        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] == '0') {
                    dfs(grid, visited, i, j);
                    cnt++;
                }
            }
        }
        return cnt;

    }

    public void dfs(char[][] grid, char[][] visited, int i, int j) {
        visited[i][j] = '1';

        if (j > 0 && grid[i][j - 1] == '1' && visited[i][j - 1] == '0') {
            dfs(grid, visited, i, j - 1);
        }

        if (i > 0 && grid[i - 1][j] == '1' && visited[i - 1][j] == '0') {
            dfs(grid, visited, i - 1, j);
        }

        if (j < grid[0].length - 1 && grid[i][j + 1] == '1' && visited[i][j + 1] == '0') {
            dfs(grid, visited, i, j + 1);
        }

        if (i < grid.length - 1 && grid[i + 1][j] == '1' && visited[i + 1][j] == '0') {
            dfs(grid, visited, i + 1, j);
        }

    }
}
