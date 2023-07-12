package CodeForces.Round_878_Div3;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Scanner;

public class C {

    public static int f(int n, int k, int max, int[] temp) {
        int ans = 0;
        int st = 0;
        int end = 0;
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for (end = 0; end < n; end++) {
            if (temp[end] > max) {
                mp.put(end, temp[end]);
                st = end+1;
            }

            if (end - st + 1 >= k)
                ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int max = sc.nextInt();

            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                temp[j] = sc.nextInt();
            }

            arr.add(f(n, k, max, temp));
        }

        for (int i : arr)
            System.out.println(i);

        sc.close();
        // System.out.println(f(10, 2));
        // System.out.println(f(179, 100));

    }

}
