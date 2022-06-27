package Milestone_3.Recursion;

import java.util.*;

public class MergeSort {
    public static void mergeSort(int[] input) {
        // Write your code here
        if (input.length <= 1) {
            return;
        }
        int mid = (input.length - 1) / 2;
        int arr1[] = Arrays.copyOfRange(input, 0, mid + 1);
        int arr2[] = Arrays.copyOfRange(input, mid + 1, input.length);
        mergeSort(arr1);
        mergeSort(arr2);
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < arr2.length; i++) {
        // System.out.print(arr2[i] + " ");
        // }

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (i >= arr1.length) {

            }
            if (arr1[i] <= arr2[j]) {
                input[k] = arr1[i];
                k++;
                i++;
            } else {
                input[k] = arr2[j];
                k++;
                j++;
            }
        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                input[k] = arr2[j];
                j++;
                k++;
            }
        } else {
            while (i < arr1.length) {
                input[k] = arr1[i];
                i++;
                k++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 3, 2, 4, 5 };
        mergeSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
