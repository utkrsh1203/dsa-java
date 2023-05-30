package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L6_OddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i += 2) {
            for (int j = i; j <= 2 * n - 1; j += 2) {
                System.out.print(j);
            }
            for (int j = 1; j < i; j += 2) {
                System.out.print(j);

            }
            System.out.println();
        }
        sc.close();
    }

}
