package Milestone_2;

public class M2_L2_RotateArray {
    // Method 1
    // public static void swap(int[] arr) {
    // int temp = arr[0];
    // for (int i = 0; i < arr.length - 1; i++) {
    // int x = arr[i];
    // arr[i] = arr[i + 1];
    // arr[i + 1] = x;
    // }
    // arr[arr.length - 1] = temp;
    // }

    // public static void rotate(int[] arr, int d) {
    // for (int i = 0; i < d; i++) {
    // swap(arr);
    // }
    // }

    // Method 2

    public static void rotate(int[] arr, int d) {
        int newArr[] = new int[d];
        for (int i = 0; i < arr.length && d > 0; i++) {

            if (i < d) {
                newArr[i] = arr[i];
            } else {
                arr[i - d] = arr[i];
            }
        }
        int l = arr.length - d;
        for (int i = 0; i < newArr.length; i++, l++) {
            arr[l] = newArr[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 0, 4, 5 };
        rotate(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
