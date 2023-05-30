package Coding_Ninjas.Milestone_2;

public class T2_Print2DArray {
    public static void print2DArray(int input[][]) {
        // Write your code here
        for (int i = 0; i < input.length; i++) {
            for (int j = input.length; j > i; j--) {
                for (int k = 0; k < input[0].length; k++) {
                    System.out.print(input[i][k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print2DArray(arr);
    }
}
