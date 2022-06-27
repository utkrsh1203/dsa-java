package Milestone_1;

import java.util.*;

public class M1_L6_TriangleOfNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int m = n - 1;

        for (int i = 0; i <= m; i++) {
            for (int j = m; j > i; j--) {
                System.out.print(" ");
                // System.out.print("No of spaces = " + j);
            }
            for (int k = i; k < 2 * i + 1; k++) {
                System.out.print(k + 1);
            }

            for (int l = 2 * i; l > i; l--) {
                System.out.print(l);
            }

            System.out.println();
        }

        scn.close();
    }

}
