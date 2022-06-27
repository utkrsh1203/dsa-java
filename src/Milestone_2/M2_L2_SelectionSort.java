package Milestone_2;

public class M2_L2_SelectionSort {
    public static void selectionSort(int[] arr) {
        // Your code goes here
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i], minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 4, 2, 7, 6 };
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}
