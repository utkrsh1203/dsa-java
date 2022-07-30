package Milestone_5.Graphs;

import java.util.*;

public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        q.add(0);
        ans.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int curr = q.poll();

            for (Integer i : adj.get(curr)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}
