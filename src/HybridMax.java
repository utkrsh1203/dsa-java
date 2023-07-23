import java.util.*;

public class HybridMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }

        List<Pair<Integer, Integer>> mna = new ArrayList<>(n + 1);
        List<Pair<Integer, Integer>> mnb = new ArrayList<>(m + 1);

        for (int i = 0; i <= n; i++) {
            mna.add(new Pair<>(0, 1_000_000_000));
        }

        for (int i = 0; i <= m; i++) {
            mnb.add(new Pair<>(0, 1_000_000_000));
        }

        for (int i = 1; i <= n; i++) {
            int currentA = a.get(i - 1);
            mna.get(i).first = Math.max(mna.get(i - 1).first, currentA);
            mna.get(i).second = Math.min(mna.get(i - 1).second, currentA);
        }

        for (int i = 1; i <= m; i++) {
            int currentB = b.get(i - 1);
            mnb.get(i).first = Math.max(mnb.get(i - 1).first, currentB);
            mnb.get(i).second = Math.min(mnb.get(i - 1).second, currentB);
        }

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i != n) {
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] +
                            Math.max(mna.get(i + 1).first, mnb.get(j).first) -
                            Math.min(mna.get(i + 1).second, mnb.get(j).second));
                }

                if (j != m) {
                    dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i][j] +
                            Math.max(mna.get(i).first, mnb.get(j + 1).first) -
                            Math.min(mna.get(i).second, mnb.get(j + 1).second));
                }
            }
        }

        System.out.println(dp[n][m]);
    }

    static class Pair<T, U> {
        T first;
        U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
}
