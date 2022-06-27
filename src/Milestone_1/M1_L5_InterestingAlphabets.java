package Milestone_1;

import java.util.*;

public class M1_L5_InterestingAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) {

            for (int j = i; j <= n - 1; j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
        sc.close();
    }

}
