package Milestone_2;

public class M2_L1_FindUnique {
    public static int FindUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return arr[i];
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 5, 1, 3, 4 };
        System.out.println(FindUnique(arr));
    }
}
