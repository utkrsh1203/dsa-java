package Milestone_1;

import java.util.*;

public class M1_L4_PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        System.out.println(ans);
        sc.close();
    }
}
