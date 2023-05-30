package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L5_ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
