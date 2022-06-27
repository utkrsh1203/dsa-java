package Milestone_2;

public class M2_L2_PushZeroesToEnd {
    public static void pushZerosAtEnd(int[] arr) {

        // Method 1
        // int cnt = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // cnt++;
        // } else {
        // if (cnt != 0) {
        // arr[i - cnt] = arr[i];
        // arr[i] = 0;
        // }
        // }
        // }

        // Method 2
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 0, 4, 2, 0, 0, 6 };
        pushZerosAtEnd(arr);
    }
}
