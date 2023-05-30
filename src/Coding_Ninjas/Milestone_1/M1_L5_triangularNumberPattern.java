package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L5_triangularNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
