package Milestone_2;

public class T2_LeaderOfArray {
    public static void leaders(int[] input) {
        if (input.length == 0) {
            return;
        }

        int arr[] = new int[input.length];
        int cnt = 0;

        int max = Integer.MIN_VALUE;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] >= max) {
                max = input[i];
                arr[cnt] = input[i];
                cnt++;

            }
        }
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 6, 5, 4, 4, 1, 3 };
        leaders(arr);
    }
}
