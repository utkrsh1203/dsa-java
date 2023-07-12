package Coding_Ninjas.Milestone_3.Recursion;

public class QuickSort {

    public static int partition(int[] arr, int s, int e) {
        int x = arr[s];
        int k = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < x) {
                k++;
            }
        }
        arr[s] = arr[s + k];
        arr[s + k] = x;

        int i = s, j = e;

        while (i < j) {
            if (arr[i] < x) {
                i++;
            } else if (arr[j] >= x) {
                j--;
            } else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }

        return s + k;
    }

    public static void quickSort(int[] arr, int s, int e) {

        if (s >= e) {
            return;
        }
        int i = partition(arr, s, e);
        quickSort(arr, s, i - 1);
        quickSort(arr, i + 1, e);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 19, 25, 2, 4, 11, 13, 10, 7, 5, 12, 8, 5, 15, 16, 11, 7, 9, 22, 0, 6, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
