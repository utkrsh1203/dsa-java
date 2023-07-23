import java.util.*;

class pair {
    int val;
    int idx;

    public pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int notest=sc.nextInt();
        int n = sc.nextInt();
        pair[] hhe = new pair[n];
        for (int i = 0; i < n; i++) {
            hhe[i] = new pair(sc.nextInt(), i + 1);
        }
        Arrays.sort(hhe, (a, b) -> a.val - b.val);

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int k = sc.nextInt();
            int no = sc.nextInt();
            int[] fault = new int[no];
            for (int j = 0; j < no; j++) {
                fault[j] = sc.nextInt();
            }
            System.out.println(help(k, fault, hhe));
        }
        // input
        // sort =pair banake
        //

    }

    public static int help(int k, int[] fault, pair[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < fault.length; i++) {
            hs.add(fault[i]);
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].val < k && !hs.contains(arr[i].idx)) {
                k -= arr[i].val;
                cnt++;
            }
        }
        return cnt;
    }

}