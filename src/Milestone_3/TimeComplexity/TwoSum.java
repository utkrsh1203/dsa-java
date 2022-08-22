package Milestone_3.TimeComplexity;

import java.util.*;

public class TwoSum {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int pairSum(int[] arr, int num) {
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
}
