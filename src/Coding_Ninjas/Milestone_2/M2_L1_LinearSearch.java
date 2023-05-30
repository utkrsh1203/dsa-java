package Coding_Ninjas.Milestone_2;

public class M2_L1_LinearSearch {
    public static int LinearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
