package Milestone_5.Graphs;

import java.util.*;

public class Bfs_Matrix {
    public static void bfs(int[][] adjMatrix, int index, boolean[] visited, ArrayList<Integer> ans) {

        Queue<Integer> q = new LinkedList<>();

        q.add(index);
        visited[index] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);

            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }

        }

    }

    public static void bfs(int[][] adjMatrix) {
        boolean[] visited = new boolean[adjMatrix.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                bfs(adjMatrix, i, visited, ans);
            }
        }

    }
}
