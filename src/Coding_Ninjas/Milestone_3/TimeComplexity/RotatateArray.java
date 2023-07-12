package Coding_Ninjas.Milestone_3.TimeComplexity;

public class RotatateArray {
    public static void rotate(int[] arr, int d) {
        // Your code goes here
        if (d == arr.length) {
            return;
        }
        if (d > arr.length) {
            d = d % arr.length;
        }
        int[] newArr = new int[d];
        int i = 0;
        int j = d;
        for (; i < d; i++, j++) {
            newArr[i] = arr[i];
        }
        j = 0;
        for (; i < arr.length; i++, j++) {
            arr[j] = arr[i];
        }
        i = arr.length - d;
        j = 0;
        for (; i < arr.length; i++, j++) {
            arr[i] = newArr[j];
        }
    }
}
