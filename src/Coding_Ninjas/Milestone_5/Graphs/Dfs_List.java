package Coding_Ninjas.Milestone_5.Graphs;

import java.util.*;

public class Dfs_List {
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[V];

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, ans);
            }
        }
        return ans;
    }

    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
        visited[v] = true;
        ans.add(v);
        for (Integer i : adj.get(v)) {
            if (!visited[i]) {
                dfs(i, adj, visited, ans);
            }
        }
    }
}
