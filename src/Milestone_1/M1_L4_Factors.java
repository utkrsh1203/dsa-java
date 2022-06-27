package Milestone_1;

import java.util.*;

public class M1_L4_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 2;
        for (int i = div; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
