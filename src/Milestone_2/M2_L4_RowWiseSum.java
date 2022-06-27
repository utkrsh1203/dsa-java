package Milestone_2;

public class M2_L4_RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        // Your code goes here

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
