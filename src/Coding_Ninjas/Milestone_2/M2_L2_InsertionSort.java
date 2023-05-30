package Coding_Ninjas.Milestone_2;

public class M2_L2_InsertionSort {
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 4, 2, 7, 6 };
        InsertionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}
