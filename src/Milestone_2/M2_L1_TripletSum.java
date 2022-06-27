package Milestone_2;

import java.util.Arrays;

public class M2_L1_TripletSum {
    public static int tripletSum1(int[] arr, int x) {
        if (arr.length < 3) {
            return 0;
        }
        int cnt = 0;

        // Method 1: Brute Force
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        cnt++;
                    }
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

    public static int tripletSum2(int[] arr, int n) {
        // Your code goes here
        int cnt = 0;
        Arrays.sort(arr);

        for (int m = 0; m < arr.length; m++) {

            int i = m + 1, j = arr.length - 1;
            int num = n - arr[m];
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
                    System.out.println(
                            "array elements " + arr[m] + " index " + m + " " + arr[i - 1] + " " + arr[j + 1]);
                    System.out.println("count " + cnti + " " + cntj);

                    cnt += cnti * cntj;
                } else if (arr[i] + arr[j] > num) {
                    j--;
                } else if (arr[i] + arr[j] < num) {
                    i++;
                }
            }

        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 0, 2, 1 };
        System.out.println(tripletSum1(arr, 6));
    }

}
