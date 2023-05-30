package Coding_Ninjas.Milestone_2;

public class M2_L1_ArrangeArray {
    public static void ArrangeArray(int[] arr, int n) {
        // Method 1
        // for (int i = 0, x = 1; i < arr.length; i++) {
        // if (x % 2 != 0) {
        // if (x == n && n % 2 != 0) {
        // arr[i] = x;
        // x = n - 1;
        // } else if (x - 1 == n && n % 2 == 0) {
        // arr[i] = x - 1;
        // x = n - 2;
        // } else {
        // arr[i] = x;
        // x += 2;
        // }
        // } else {
        // if (x == 0) {
        // break;
        // } else {
        // arr[i] = x;
        // x -= 2;
        // }
        // }
        // }

        // Method 2
        // int i = 0, x = 1;
        // for (; x <= n; x += 2) {
        // arr[i] = x;
        // i++;

        // }
        // if (n % 2 != 0) {
        // x = n - 1;
        // } else {
        // x = n;
        // }

        // while (x >= 2) {
        // arr[i] = x;
        // x -= 2;
        // i++;
        // }

        // Method 3

        // for (int i = 1, x = 0; i <= n; i++) {
        // if (i % 2 != 0) {
        // arr[x] = i;
        // x++;
        // } else {
        // arr[n - x] = i;
        // }
        // }

        // Method 4

        int start = 0, end = n - 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arr[start] = i;
                start++;
            } else {
                arr[end] = i;
                end--;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        ArrangeArray(arr, 8);
    }
}