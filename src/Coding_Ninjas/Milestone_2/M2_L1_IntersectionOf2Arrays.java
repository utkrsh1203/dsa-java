package Coding_Ninjas.Milestone_2;

public class M2_L1_IntersectionOf2Arrays {
    public static void intersections(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 2, 5, 0 };
        int[] arr2 = { 2, 4, 6, 7, 4 };
        intersections(arr2, arr1);
    }

}
