package Coding_Ninjas.Milestone_2;

public class M2_L4_SpiralPrint2 {
    public static void spiralPrint(int matrix[][]) {
        // Your code goes here
        int rowStart = 0;
        int rowEnd = matrix[0].length - 1;
        int colStart = 0;
        int colEnd = matrix.length - 1;

        int rowCurr = 0, colCurr = 0;
        int i = 0;

        int j = 0;
        int k = 0;
        while (rowStart < rowEnd && colStart <= colEnd) {
            if (i % 2 == 0) {
                if (j % 2 == 0) {
                    while (rowCurr <= rowEnd) {
                        System.out.print(matrix[colCurr][rowCurr] + " ");
                        rowCurr++;
                    }
                    rowEnd--;
                    rowCurr--;
                    j++;

                } else {
                    while (rowCurr >= rowStart) {
                        System.out.print(matrix[colCurr][rowCurr] + " ");
                        rowCurr--;
                    }
                    rowStart++;
                    rowCurr++;
                    j++;
                }
                i++;
            }

            else {
                if (k % 2 == 0) {
                    while (colCurr < colEnd) {
                        colCurr++;
                        System.out.print(matrix[colCurr][rowCurr] + " ");
                    }
                    colEnd--;
                    rowCurr--;
                    k++;

                } else {
                    while (colCurr > colStart) {
                        colCurr--;
                        System.out.print(matrix[colCurr][rowCurr] + " ");
                    }
                    colStart++;
                    colCurr++;
                    k++;
                }

                i++;
                // System.out.println("i = " + i);
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 4 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        spiralPrint(arr);
    }
}