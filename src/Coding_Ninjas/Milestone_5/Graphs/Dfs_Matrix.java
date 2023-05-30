package Coding_Ninjas.Milestone_5.Graphs;

import java.util.ArrayList;

public class Dfs_Matrix {
    public static void dfs(int adjMatrix[][], int currentVertex, boolean visited[], ArrayList<Integer> ans) {
        visited[currentVertex] = true;
        ans.add(currentVertex);
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
                dfs(adjMatrix, i, visited, ans);
            }
        }
    }

    public static void dfs(int adjMatrix[][]) {
        boolean visited[] = new boolean[adjMatrix.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                dfs(adjMatrix, i, visited, ans);
            }
        }
    }
}
