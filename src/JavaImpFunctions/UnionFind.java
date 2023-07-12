package JavaImpFunctions;

class DisjointSet {
    int[] parent;

    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int findPar(int ele) {
        if (ele == parent[ele])
            return ele;
        return parent[ele] = findPar(parent[ele]);
    }

    public void union(int x, int y) {
        int parx = parent[x];
        int pary = parent[y];
        if (parx == pary)
            return;
        parent[parx] = pary;
    }

}

public class UnionFind {
    int[] rank;
    int[] parent;
    int[] size;

    public UnionFind(int n) {
        rank = new int[n];
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int findPar(int ele) {
        if (ele == parent[ele]) {
            return ele;
        }
        return parent[ele] = findPar(parent[ele]);
    }

    public void unionByRank(int u, int v) {
        int paru = findPar(u);
        int parv = findPar(v);
        if (paru == parv)
            return;
        if (rank[paru] < rank[parv]) {
            parent[paru] = parv;
        } else if (rank[parv] < rank[paru]) {
            parent[parv] = paru;
        } else {
            parent[parv] = paru;
            rank[paru] = rank[paru] + 1;
        }
    }

    public void unionBySize(int u, int v) {
        int paru = findPar(u);
        int parv = findPar(v);
        if (paru == parv)
            return;
        if (size[paru] < size[parv]) {
            parent[paru] = parv;
            size[parv] = size[parv] + size[paru];
        } else {
            parent[parv] = paru;
            size[paru] = size[paru] + size[parv];
        }
    }
}