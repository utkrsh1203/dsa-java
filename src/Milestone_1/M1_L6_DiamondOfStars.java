package Milestone_1;

import java.util.*;

public class M1_L6_DiamondOfStars {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int m = n / 2;

        for (int i = 0; i <= m; i++) {
            for (int j = m; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            for (int l = 2 * i; l > i; l--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = m - 1; i >= 0; i--) {

            for (int j = i; j < m; j++) {
                System.out.print(" ");

            }

            for (int k = i; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            for (int l = 2 * i; l > i; l--) {
                System.out.print("*");
            }

            System.out.println();
        }
        scn.close();
    }
}
