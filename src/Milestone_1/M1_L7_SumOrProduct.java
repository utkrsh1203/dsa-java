package Milestone_1;

import java.util.*;

public class M1_L7_SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        if (c == 1) {
            int s = 0;
            for (int i = 1; i <= n; i++) {
                s += i;
            }
            System.out.println(s);
        } else if (c == 2) {
            int p = 1;
            for (int i = 1; i <= n; i++) {
                p *= i;
            }
            System.out.println(p);

        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
