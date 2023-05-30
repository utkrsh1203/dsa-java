package Milestone_3.TimeComplexity;

import java.util.*;

public class FindUnique {
    public static int findUnique(int[] arr) {
        int XOR = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR ^= arr[i];
        }
        return XOR;
    }

    public static int findUnique2(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                i++;
            } else {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

}
