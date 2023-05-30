package Coding_Ninjas.Milestone_2;

public class M2_L1_SwapAlternate {
    public static void SwapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int x = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = x;
        }

        for (var each : arr) {
            System.out.print(each + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 4, 6 };
        SwapAlternate(arr);
    }

}
