package JavaImpFunctions.SegmentTree;

class SegmentTree {

    int tree[], lazy[], ar[];

    SegmentTree(int arr[]) {
        ar = arr;
        int n = ar.length;
        tree = new int[4 * n];
        lazy = new int[4 * n];
        build(1, 0, n - 1);
    }

    void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = ar[start];
        } else {
            int mid = (start + end) / 2;
            build(node * 2, start, mid);
            build(node * 2 + 1, mid + 1, end);
            tree[node] = tree[node * 2] + tree[node * 2 + 1];
        }
    }

    void update(int l, int r, int val) {
        update(1, 0, ar.length - 1, l, r, val);
    }

    void update(int node, int start, int end, int l, int r, int val) {
        propagate(node, start, end);
        if (end < l || r < start)
            return;
        // propagate(node, start, end); create's problem
        // complete range was updated earlier
        // When updating again
        // root needs to be updated even if call is on 1 subtree
        if (start == end) {
            tree[node] += val;
        } else if (l <= start && end <= r) {
            lazy[node] += val;
            propagate(node, start, end);
        } else {
            int mid = (start + end) / 2;
            update(node * 2, start, mid, l, r, val);
            update(node * 2 + 1, mid + 1, end, l, r, val);
            tree[node] = tree[node * 2] + tree[node * 2 + 1];
        }
    }

    int query(int l, int r) {
        return query(1, 0, ar.length - 1, l, r);
    }

    private void propagate(int node, int start, int end) {
        if (start == end) {
            tree[node] += lazy[node];
            lazy[node] = 0;
        } else {
            tree[node] += (end - start + 1) * lazy[node];
            lazy[node * 2] += lazy[node];
            lazy[node * 2 + 1] += lazy[node];
            lazy[node] = 0;
        }
    }

    int query(int node, int start, int end, int l, int r) {
        // propagate(); no problem
        if (end < l || r < start)
            return 0;
        propagate(node, start, end);
        if (start == end) {
            return tree[node];
        } else if (l <= start && end <= r) {
            return tree[node];
        } else {
            int mid = (start + end) / 2;
            int left = query(node * 2, start, mid, l, r);
            int right = query(node * 2 + 1, mid + 1, end, l, r);
            return left + right;
        }
    }

}