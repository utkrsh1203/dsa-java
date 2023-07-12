package JavaImpFunctions.SegmentTree;

class Pair {
    int max;
    int sum;

    Pair(int max, int sum) {
        this.max = max;
        this.sum = sum;
    }
}

class SegmentTree {
    Pair tree[];
    int arr[];

    SegmentTree(int arr[]) {
        this.arr = arr;
        tree = new Pair[arr.length * 4];
        build(1, 0, arr.length - 1);
    }

    public void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = new Pair(arr[start], arr[start]);
        } else {
            int mid = (start + end) / 2;
            build(node * 2, start, mid);
            build(node * 2 + 1, mid + 1, end);
            Pair left = tree[node * 2];
            Pair right = tree[node * 2 + 1];

            tree[node] = calc(left, right);
        }
    }

    private Pair calc(Pair left, Pair right) {
        Pair ans = new Pair(0, 0);

        ans.sum = Math.max(left.max + right.max, Math.max(left.sum, right.sum));
        ans.max = Math.max(left.max, right.max);

        return ans;
    }

    public void update(int idx, int val) {
        update(1, 0, arr.length - 1, idx, val);
    }

    private void update(int node, int start, int end, int idx, int val) {

        if (start == end) {
            arr[start] = val;
            tree[node].max = tree[node].sum = val;
        } else {
            int mid = (start + end) / 2;
            if (start <= idx && idx <= mid) {
                update(node * 2, start, mid, idx, val);
            } else {
                update(node * 2 + 1, mid + 1, end, idx, val);
            }
            tree[node] = calc(tree[node * 2], tree[node * 2 + 1]);
        }

    }

    public int query(int l, int r) {
        return query(1, 0, arr.length - 1, l, r).sum;
    }

    private Pair query(int node, int start, int end, int l, int r) {

        if (end < l || start > r)
            return new Pair(0, 0);

        if (start == end) {
            return tree[node];
        } else if (l <= start && end <= r) {
            return tree[node];
        } else {
            int mid = (start + end) / 2;
            Pair left = query(node * 2, start, mid, l, r);
            Pair right = query(node * 2 + 1, mid + 1, end, l, r);

            return calc(left, right);
        }
    }

}
