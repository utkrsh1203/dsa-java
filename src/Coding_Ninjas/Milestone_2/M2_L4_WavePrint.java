package Coding_Ninjas.Milestone_2;

public class M2_L4_WavePrint {
    // public static void wavePrint(int mat[][]) {
    // // Your code goes here
    // if (mat.length == 0){
    // return;
    // }
    // int i = 0, j = 0;

    // // while (!(i == mat.length - 1 && j == mat[0].length))
    // while (j < mat[0].length - 1) {
    // System.out.print(mat[i][j] + " ");
    // if (i == mat.length - 1 || (j > 0 && i == 0)) {
    // j++;
    // // if (!(i == mat.length - 1 && j == mat[0].length)) {
    // System.out.print(mat[i][j] + " ");
    // // }
    // }

    // if (j % 2 == 0) {

    // i++;
    // } else {
    // i--;
    // }
    // }

    // while (true) {
    // if (j % 2 == 0) {
    // System.out.print(mat[i][j] + " ");
    // i++;
    // if (i == mat.length) {
    // break;
    // }

    // } else {
    // System.out.print(mat[i][j] + " ");
    // i--;
    // if (i == -1) {
    // break;
    // }
    // }
    // }

    // }

    public static void wavePrint(int mat[][]) {
        for (int i = 0; i < mat[0].length; i++) {
            if (mat.length == 0) {
                return;
            }

            if (i % 2 == 0) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            } else {
                for (int j = mat.length - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + " ");

                }
            }

        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
        wavePrint(arr);
    }
}
