package Milestone_2;

public class M2_L2_Merge2SortedArrays {
    public static int[] merge(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                arr3[k] = arr2[j];
                k++;
                j++;
            } else {
                arr3[k] = arr1[i];
                k++;
                i++;
            }
        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        } else {
            while (i < arr1.length) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        }
        return arr3;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 7 };
        int arr2[] = { 2, 3, 5, 6 };
        int[] arr3 = merge(arr1, arr2);
        for (int j : arr3) {
            System.out.print(j + " ");

        }
    }
}
