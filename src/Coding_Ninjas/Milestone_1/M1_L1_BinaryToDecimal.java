package Coding_Ninjas.Milestone_1;

import java.util.*;
import java.lang.Math;

public class M1_L1_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = n;
        int d = 0;
        int cnt = 0;
        int s = 0;

        while (m > 0) {
            d = m % 10;
            m = m / 10;
            s += (int) Math.pow(2, cnt) * d;
            cnt++;
        }
        System.out.println(s);
        sc.close();
    }
}
