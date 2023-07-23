import java.util.*;
import java.io.*;

class Median {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public Median() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void add(int x) {
        if (maxHeap.isEmpty() || x <= maxHeap.peek())
            maxHeap.add(x);
        else
            minHeap.add(x);

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public int get() {
        return maxHeap.peek();
    }
}

class Main {
    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(Pair other) {
            if (this.first == other.first) {
                return Integer.compare(this.second, other.second);
            }
            return Integer.compare(this.first, other.first);
        }
    }

    static ArrayList<ArrayList<Integer>> graph;
    static Median orderedSet;
    static long answer;

    static void dfs(int u, int p, int depth, int[] nums) {
        orderedSet.add(nums[u]);
        if ((depth & 1) == 1) {
            answer += orderedSet.get();
        }

        for (int v : graph.get(u)) {
            if (v != p) {
                dfs(v, u, depth + 1, nums);
            }
        }

        orderedSet.add(nums[u]);
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            System.out.println("Cnt " + i);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.println("hello");

        orderedSet = new Median();
        answer = 0;
        dfs(0, -1, 1, nums);
        System.out.println(answer);
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();

        while (numTestCases-- > 0) {
            solve();
        }
    }
}
