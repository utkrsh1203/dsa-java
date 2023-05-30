package Coding_Ninjas.Milestone_5.Graphs;

import java.util.*;

public class cycleDetection_DirectedGraph {
    class Solution {
        // Function to detect cycle in a directed graph.
        public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
            // code here

            boolean[] visited = new boolean[V];
            boolean[] recS = new boolean[V];

            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (dfs(i, adj, visited, recS)) {
                        return true;
                    }
                }
            }

            return false;

        }

        public boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recS) {
            visited[i] = true;
            recS[i] = true;
            for (int j : adj.get(i)) {
                if (!visited[j]) {
                    if (dfs(j, adj, visited, recS)) {
                        return true;
                    }
                } else if (recS[j]) {
                    return true;
                }
            }
            recS[i] = false;
            return false;

        }

    }
}
