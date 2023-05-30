package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L4_FahrenhritToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        for (int i = s; i <= e; i = i + w) {
            int c = (i - 32) * 5 / 9;
            System.out.println(i + " " + c);
        }

        sc.close();

    }

}
