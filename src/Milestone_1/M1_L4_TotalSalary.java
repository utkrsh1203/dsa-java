package Milestone_1;

import java.util.*;
import java.lang.Math;

public class M1_L4_TotalSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int basic = sc.nextInt();
        int grade = sc.next().charAt(0);

        int allow = 0;

        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double hra = (0.2 * basic);
        double da = (0.5 * basic);
        double pf = (0.11 * basic);

        double TotalSalary = (basic + hra + da + allow - pf);

        System.out.println(Math.round(TotalSalary));

        sc.close();

    }
}
