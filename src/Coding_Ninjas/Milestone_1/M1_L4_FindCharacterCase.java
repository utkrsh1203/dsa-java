package Coding_Ninjas.Milestone_1;

import java.util.*;

public class M1_L4_FindCharacterCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println(1);

        } else if (ch >= 96 && ch <= 121) {
            System.out.println(0);

        } else {
            System.out.println(-1);
        }
        sc.close();

    }
}
