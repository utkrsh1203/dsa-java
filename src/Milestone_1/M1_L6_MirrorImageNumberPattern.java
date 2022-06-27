package Milestone_1;

import java.util.*;

public class M1_L6_MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {

            for (int m = i; m > 1; m--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
