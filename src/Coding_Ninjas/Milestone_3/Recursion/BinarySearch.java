package Coding_Ninjas.Milestone_3.Recursion;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = (s + e) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (x < arr[mid]) {
            return binarySearch(arr, x, s, mid - 1);
        } else {
            return binarySearch(arr, x, mid + 1, e);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 6, 0, 7));
    }
}
