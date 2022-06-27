package Milestone_2;

public class M2_L1_FindDuplicate {
    public static int FindDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return arr[i];
                }
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 5, 0, 0 };
        System.out.println(FindDuplicate(arr));
    }
}
