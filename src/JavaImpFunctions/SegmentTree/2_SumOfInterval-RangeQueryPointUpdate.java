package JavaImpFunctions.SegmentTree;

class SegmentTree {
    
    int tree[];
    int ar[];

    SegmentTree(int arr[]) {
      ar = arr;
      tree = new int[4 * ar.length];
      build(1, 0, ar.length - 1);
    }

    private void build(int node, int start, int end) {
      if (start == end) { // leaf
        tree[node] = ar[start];
      } else {
        int mid = (start + end) / 2;
        build(node * 2, start, mid);
        build(node * 2 + 1, mid + 1, end);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
      }
    }

    void update(int pos, int val) {
      update(1, 0, ar.length - 1, pos, val);
    }

    private void update(int node, int start, int end, int pos, int val) {
      if (start == end) {
        ar[start] = val;
        tree[node] = val;
      } else {
        int mid = (start + end) / 2;
        if (start <= pos && pos <= mid) {
          update(node * 2, start, mid, pos, val);
        } else {
          update(node * 2 + 1, mid + 1, end, pos, val);
        }

        tree[node] = tree[node * 2] + tree[node * 2 + 1];
      }
    }

    int query(int l, int r) {
      return query(1, 0, ar.length - 1, l, r);
    }

    private int query(int node, int start, int end, int l, int r) {
      if (end < l || r < start)return 0;

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
