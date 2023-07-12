package CodeForces.Round_878_Div3;

import java.util.ArrayList;
import java.util.Scanner;

public class A {

    public static String f(int n, String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            Character curr = s.charAt(i);
            sb.append(curr);
            while (i < s.length() - 1 && s.charAt(i + 1) != curr) {
                i++;
            }
            i++;
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            arr.add(f(n, s));
        }
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }

}
