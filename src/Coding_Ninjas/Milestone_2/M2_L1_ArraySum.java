package Coding_Ninjas.Milestone_2;

public class M2_L1_ArraySum {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }

        return sum;
    }
}
