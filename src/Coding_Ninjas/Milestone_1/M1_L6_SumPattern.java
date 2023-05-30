package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L6_SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
                System.out.print(j);
                if (j != i) {
                    System.out.print("+");
                } else {
                    System.out.print("=" + sum);
                }
            }
            System.out.println();

        }

        sc.close();
    }
}
