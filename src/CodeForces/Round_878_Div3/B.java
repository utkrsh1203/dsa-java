package CodeForces.Round_878_Div3;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
    static int n;
    static int k;

    public static int f(int N, int K) {
        if(K > 32) return N+1;
        // n = N;
        // k = K;
        // Integer[][] dp = new Integer[K + 1][N + 1];

        long ans = 0;
        for (int i = 0; i < K; i++) {
            ans += Math.pow(2, i);
        }

        return 1 + (int) Math.min(N, ans);

        // return findWays(0, 0, dp);
    }

    // public static int findWays(int i, int sum, Integer dp[][]) {

    // if (i == k) {
    // return sum > n ? 0 : 1;
    // }

    // if (sum > n) {
    // return 0;
    // }
    // if (sum < 0)
    // return 0;
    // if (dp[i][sum] != null)
    // return dp[i][sum];

    // int ans = 0;
    // ans += findWays(i + 1, sum, dp);
    // if (sum + (int) Math.pow(2, i) < n)
    // ans += findWays(i + 1, sum + (int) Math.pow(2, i), dp);

    // return dp[i][sum] = ans;

    // }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            arr.add(f(n, k));
        }

        for (int i : arr)
            System.out.println(i);

        sc.close();
        // System.out.println(f(10, 2));
        // System.out.println(f(179, 100));

    }
}
