package Milestone_2;

public class M2_L1_Sort01 {
    public static void sortZeroesAndOne(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                cnt++;
            }
        }
        for (int i = arr.length - 1; cnt > 0; i--, cnt--) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 0 };
        sortZeroesAndOne(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
