package Milestone_2;

public class M2_L2_BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        // Your code goes here

        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] > x) {
                e = m - 1;
            } else if (arr[m] < x) {
                s = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 9 };
        System.out.println(binarySearch(arr, 5));
    }
}
