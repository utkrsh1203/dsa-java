package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L4_SumOfEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n;
        int sumEven = 0;
        int sumOdd = 0;

        while (m > 0) {
            int digit = m % 10;

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            m = m / 10;
        }
        System.out.println(sumEven + " " + sumOdd);
        sc.close();

    }
}
