package Milestone_1;

import java.util.*;

public class M1_L7_ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n;

        int d;
        int rev = 0;

        while (m > 0) {
            d = m % 10;
            m = m / 10;
            rev = rev * 10 + d;

        }

        System.out.println(rev);
        sc.close();
    }
}
