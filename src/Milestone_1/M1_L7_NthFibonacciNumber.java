package Milestone_1;

import java.util.*;

public class M1_L7_NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n0 = 0;
        int n1 = 1;
        int s = 0;

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= n; i++) {
                s = n0 + n1;
                n0 = n1;
                n1 = s;
            }
            System.out.println(s);
        }

        sc.close();
    }
}
