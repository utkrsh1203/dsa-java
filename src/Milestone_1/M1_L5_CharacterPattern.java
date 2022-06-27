package Milestone_1;

import java.util.*;

public class M1_L5_CharacterPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cnt = i;

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (cnt + 65));
                cnt++;
            }
            System.out.println();
        }
        sc.close();
    }

}
