package Coding_Ninjas.Milestone_2;

public class M2_L4_SumOfDiagonalsAndBoundaries {
    public static void totalSum(int[][] mat) {
        // Your code goes here

        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 || i == mat.length - 1 || j == i || i + j == mat.length - 1 || j == 0
                        || j == mat[0].length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] arr = { { 6, 9, 8, 5 }, { 9, 2, 4, 1 }, { 8, 3, 9, 3 }, { 8, 7, 8, 6 } };
        totalSum(arr);
    }

}
