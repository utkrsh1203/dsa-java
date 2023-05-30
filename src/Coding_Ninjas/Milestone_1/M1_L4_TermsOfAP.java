package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L4_TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1, cnt = 1; cnt <= n; i++) {
            int t = 3 * i + 2;
            if (t % 4 != 0) {
                System.out.print(t + " ");
                cnt++;
            }
        }

        sc.close();
    }
}
