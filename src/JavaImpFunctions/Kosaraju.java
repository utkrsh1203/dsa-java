package JavaImpFunctions;

import java.util.*;

class Solution {
    public static int stronglyConnectedComponents(int v, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();

        // Create a adjacency list
        for (int i = 0; i < v; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (ArrayList<Integer> i : edges) {
            adj.get(i.get(0)).add(i.get(1));
        }

        // Start from each vertex and make a dfs call to find out which elements is
        // present at the last..
        // The element in the last will be present at the bottom of the stack
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i])
                getFinishOrder(i, st, visited, adj);
        }

        // If i reverse the edges, Strongly connected components will remain connected
        // But two strongly connected components conencted to each other will have their
        // direction reversed

        // Before : S1 -> S2 -> S3 -> S4
        // After reversing the edges : S1 <- S2 <- S3 <- S4

        // Start traversing from S1 and marks all S1 visited
        // Next not visited element int the stack will be of S2, and S2 can visited
        // either S3 or S1
        

        adj = new HashMap<>();
        for (int i = 0; i < v; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (ArrayList<Integer> i : edges) {
            adj.get(i.get(1)).add(i.get(0));
        }

        visited = new boolean[v];
        int cnt = 0;
        while (!st.isEmpty()) {
            int i = st.pop();
            if (!visited[i]) {
                dfs(i, visited, adj);
                cnt++;
            }
        }

        return cnt;

    }

    public static void getFinishOrder(int i, Stack<Integer> st, boolean[] visited,
            HashMap<Integer, ArrayList<Integer>> adj) {
        visited[i] = true;

        for (int neigh : adj.get(i)) {
            if (!visited[neigh])
                getFinishOrder(neigh, st, visited, adj);
        }
        st.push(i);
    }

    public static void dfs(int i, boolean[] visited, HashMap<Integer, ArrayList<Integer>> adj) {
        visited[i] = true;

        for (int neigh : adj.get(i)) {
            if (!visited[neigh])
                dfs(neigh, visited, adj);
        }

    }

}