package Milestone_1;

import java.util.*;

public class M1_L7_SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();
        int i = 1;
        for (i = 1; i * i <= n; i++) {
            continue;
        }
        System.out.println(i - 1);

    }
}
