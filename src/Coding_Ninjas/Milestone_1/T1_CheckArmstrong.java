package Coding_Ninjas.Milestone_1;

import java.util.*;
import java.lang.Math;

public class T1_CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = n;
        int d = 0;
        int s = 0;
        int cnt = 0;

        while (m > 0) {
            d = m % 10;
            m /= 10;
            cnt++;
        }
        m = n;
        d = 0;
        s = 0;

        while (m > 0) {
            d = m % 10;
            m /= 10;
            s += (int) Math.pow(d, cnt);
        }
        if (s == n) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }

        sc.close();

    }
}
