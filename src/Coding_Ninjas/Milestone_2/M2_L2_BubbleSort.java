package Coding_Ninjas.Milestone_2;

public class M2_L2_BubbleSort {
    public static void BubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 4, 2, 7, 6 };
        BubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }

}
