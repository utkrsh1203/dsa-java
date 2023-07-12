package JavaImpFunctions.SegmentTree;

class SegamentTree {

    int arr[];
    int lazy[];

    public SegamentTree(int[] ar) {
        arr = ar;
        build(1, 0, arr.length);
    }

    public void build(int node, int start, int end) {
        if (start == end) {
            lazy[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(node * 2, start, mid);
            build(node * 2 + 1, mid + 1, end);
        }
    }

    public void update(int l, int r, int val) {
        update(1, 0, arr.length, l, r, val);
    }

    private void update(int node, int start, int end, int l, int r, int val) {

        if (start > r || end < l)
            return;

        if (start == end) {
            lazy[node] += val;
        } else if (l <= start && end <= r) {
            lazy[node] = val;
        } else {
            int mid = (start + end) / 2;
            update(node * 2, start, mid, l, r, val);
            update(node * 2 + 1, mid + 1, end, l, r, val);
        }
    }

    public int query(int idx) {
        return query(1, 0, arr.length - 1, idx);
    }

    public int query(int node, int start, int end, int idx) {

        if (start == end) {
            return lazy[node];
        } else {
            propogate(node);
            int mid = (start + end) / 2;
            if (start <= idx && idx <= mid) {
                return query(node * 2, start, mid, idx);
            } else {
                return query(node * 2 + 1, mid + 1, end, idx);
            }
        }

    }

    private void propogate(int node) {
        lazy[node * 2] += lazy[node];
        lazy[node * 2 + 1] += lazy[node];

        lazy[node] = 0;
    }

}
