package Milestone_2;

public class M2_L2_Sum012 {
    public static void sort012(int[] arr) {
        int zero = 0, one = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i < zero) {
                arr[i] = 0;
            } else if (i >= zero && i < (one + zero)) {
                arr[i] = 1;

            } else if (i >= (one + zero)) {
                arr[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 0, 1, 2, 0, 1, };
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
