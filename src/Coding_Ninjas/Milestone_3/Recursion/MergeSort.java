package Milestone_3.Recursion;

public class MergeSort {

    public static void merge(int[] arr, int[] arr1, int[] arr2, int s) {
        int i = 0, j = 0, k = s;

        while (i < arr1.length && j < arr2.length) {
            if (i >= arr1.length) {

            }
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        } else {
            while (i < arr1.length) {
                arr[k] = arr1[i];
                i++;
                k++;
            }
        }
    }

    public static void mergeSortHelper(int[] arr, int s, int e) {
        // base case
        if (s >= e)
            return;

        int mid = (s + e) / 2;
        // left Part
        mergeSortHelper(arr, s, mid);
        // right part
        mergeSortHelper(arr, mid + 1, e);

        int[] arr1 = new int[mid + 1 - s];
        int[] arr2 = new int[e - mid];

        int index = 0;

        for (int i = s; i <= mid; i++, index++) {
            arr1[index] = arr[i];
        }

        index = 0;

        for (int i = mid + 1; i <= e; i++, index++) {
            arr2[index] = arr[i];
        }

        merge(arr, arr1, arr2, s);

    }

    public static void mergeSort(int[] input) {
        // Write your code here
        if (input.length <= 1) {
            return;
        }

        mergeSortHelper(input, 0, input.length - 1);
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
