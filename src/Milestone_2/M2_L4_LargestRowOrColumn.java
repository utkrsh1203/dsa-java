package Milestone_2;

public class M2_L4_LargestRowOrColumn {

    public static int[] findMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int maxIndex = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int arr1[] = { maxIndex, max };

        return arr1;

    }

    public static void findLargest(int mat[][]) {
        // Your code goes here

        if (mat.length == 0) {
            System.out.println("row 0 -2147483648");
            return;

        }
        int SumRow[] = new int[mat.length];
        int SumColumn[] = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            SumRow[i] = sum;
        }

        for (int i = 0; i < mat[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[j][i];
            }
            SumColumn[i] = sum;
        }

        int[] arrRow = findMax(SumRow);
        int[] arrColumn = findMax(SumColumn);

        if (arrRow[1] >= arrColumn[1]) {
            System.out.println("row " + arrRow[0] + " " + arrRow[1]);
        } else {
            System.out.println("column " + arrColumn[0] + " " + arrColumn[1]);
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        findLargest(arr);
    }
}
