package Coding_Ninjas.Milestone_1;

import java.util.*;

public class T1_ZerosAndStarsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n + 1; j++) {
                if (j == i || j == 2 * n + 2 - i || j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
