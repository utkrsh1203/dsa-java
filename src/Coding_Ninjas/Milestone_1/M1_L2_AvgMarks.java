package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L2_AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int avg = (m1 + m2 + m3) / 3;

        System.out.println(name);
        System.out.println(avg);

        sc.close();
    }

}
