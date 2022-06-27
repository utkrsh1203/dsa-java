package Milestone_2;

public class M2_L2_SecondLargest {
    public static int SecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                SecondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > SecondLargest) {
                SecondLargest = arr[i];
            }
        }

        return SecondLargest;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 1, 7 };
        System.out.println(SecondLargest(arr));
    }
}