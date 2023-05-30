package Coding_Ninjas.Milestone_5.Graphs;

import java.util.*;

public class cycleDetection_UndirectedGraph {
    class Solution {
        // Function to detect cycle in an undirected graph.
        public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here

            boolean[] visited = new boolean[V];
            // int[] parent = new int[V];

            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    // parent[i]=-1;
                    if (dfs(i, adj, visited, -1)) {
                        return true;
                    }
                }
            }
            return false;

        }

        public boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent) {
            visited[i] = true;

            for (int j : adj.get(i)) {
                if (!visited[j]) {
                    // parent[j] = i;
                    if (dfs(j, adj, visited, i)) {
                        return true;
                    }
                } else if (parent != j) {
                    return true;
                }
            }

            return false;

        }

    }
}
