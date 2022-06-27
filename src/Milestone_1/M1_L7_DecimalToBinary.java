package Milestone_1;

import java.util.*;

public class M1_L7_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        String b = "";
        while (n > 0) {
            int d = n % 2;
            b = Integer.toString(d) + b;
            n = n / 2;
        }
        System.out.println(b);
        sc.close();

    }
}
