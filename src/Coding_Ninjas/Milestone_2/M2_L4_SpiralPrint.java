package Coding_Ninjas.Milestone_2;

public class M2_L4_SpiralPrint {

    public static void spiralPrint(int matrix[][]) {
        if (matrix.length == 0) {
            return;
        }

        // Your code goes here
        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;
        int rowStart = 0;
        int rowEnd = totalRows - 1;
        int colStart = 0;
        int colEnd = totalColumns - 1;

        int cnt = 0;
        while (cnt < totalRows * totalColumns) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
                cnt++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
                cnt++;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
                cnt++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][colStart] + " ");
                cnt++;
            }
            colStart++;
        }
    }

    public static void main(String[] args) {
        // int[][] arr = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 } };

        int[][] arr = {
                { 1, 2, 4 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } };

        spiralPrint(arr);
    }
}
