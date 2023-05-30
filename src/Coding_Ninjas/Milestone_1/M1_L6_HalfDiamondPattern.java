package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L6_HalfDiamondPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();

        System.out.println("*");
        for (int i = n; i > 0; i--) {

            System.out.print("*");
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("*");
        }
        for (int i = n - 1; i > 0; i--) {

            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("*");
        }
        System.out.println("*");
        sc.close();
    }

}
