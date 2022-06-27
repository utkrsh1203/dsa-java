package Milestone_2;

import java.util.Arrays;

public class M2_L1_PairSum {
    public static int pairSum1(int arr[], int x) {
        // Your code goes here
        // Method 1
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == x - arr[i]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    // Method 2
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int pairSum2(int[] arr, int num) {
        // Your code goes here
        int cnt = 0;
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == num) {
                int ei = arr[i], ej = arr[j];
                if (ei == ej) {
                    cnt += sum(j - i);
                    return cnt;
                }
                int cnti = 0, cntj = 0;
                while (arr[i] == ei) {
                    cnti++;
                    i++;
                }
                while (arr[j] == ej) {
                    cntj++;
                    j--;
                }
                cnt += cnti * cntj;
            } else if (arr[i] + arr[j] > num) {
                j--;
            } else if (arr[i] + arr[j] < num) {
                i++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5 };
        System.out.println(pairSum1(arr, 7));
    }

}
