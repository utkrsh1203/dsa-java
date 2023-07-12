import java.util.*;

class Main {
    static boolean f(int time, List<Integer> arr, int n) {
        int ans = 1;
        long s = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > time)
                return false;
            s += arr.get(i);
            if (s > time) {
                s = arr.get(i);
                ans++;
            }
        }
        return ans <= n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            long s = 0;
            for (int i = 0; i < m; i++) {
                int num = scanner.nextInt();
                arr.add(num);
                s += num;
            }
            long lo = 1, hi = s;
            long ans = hi;
            while (lo <= hi) {
                long mid = lo + (hi - lo) / 2;
                if (f((int) mid, arr, n)) {
                    ans = mid;
                    hi = mid - 1;
                } else
                    lo = mid + 1;
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}