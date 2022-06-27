package Milestone_1;

import java.util.*;

public class M1_L7_CheckSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean isTrue = true;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            arr[i] = m;
        }
        int cnt = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                isTrue = false;
                break;
            } else if (arr[i] > arr[i + 1]) {
                while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
                    i++;
                }
                i--;
                cnt++;
            } else {
                while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                    i++;
                }
                i--;
                cnt++;
            }
        }
        if (cnt > 2 || isTrue == false) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        sc.close();
    }

}
