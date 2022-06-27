package Milestone_1;

import java.util.*;

public class M1_L7_AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
