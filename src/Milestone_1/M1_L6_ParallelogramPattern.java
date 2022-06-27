package Milestone_1;

import java.util.*;

public class M1_L6_ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
