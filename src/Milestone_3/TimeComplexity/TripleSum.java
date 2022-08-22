package Milestone_3.TimeComplexity;

import java.util.*;

public class TripleSum {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int tripletSum(int[] arr, int num) {
        // Your code goes here
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int rem = num - arr[i];

            int s = i + 1;
            int e = arr.length - 1;

            while (s < e) {
                if (arr[s] + arr[e] == rem) {
                    int ei = arr[s], ej = arr[e];
                    if (ei == ej) {
                        cnt += sum(e - s);
                        break;
                    }
                    int cnti = 0, cntj = 0;
                    while (arr[s] == ei) {
                        cnti++;
                        s++;
                    }
                    while (arr[e] == ej) {
                        cntj++;
                        e--;
                    }
                    cnt += cnti * cntj;
                } else if (arr[s] + arr[e] > rem) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        return cnt;

    }
}
