package Milestone_2;

public class M2_L2_CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        } else {
            int i = 0;
            while (i < arr.length - 1 && arr[i] <= arr[i + 1]) {
                i++;
            }
            if (i == arr.length - 1) {
                return 0;
            } else {
                return (i + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(arrayRotateCheck(arr));
    }
}
