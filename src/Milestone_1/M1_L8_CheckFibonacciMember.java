package Milestone_1;

public class M1_L8_CheckFibonacciMember {
    public static boolean checkMember(int n) {
        int n0 = 0;
        int n1 = 1;
        int s = 0;

        while (s < n) {
            if (n == 0 || n == 1) {
                return true;
            } else {
                s = n0 + n1;
                n0 = n1;
                n1 = s;
                if (s == n) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkMember(8));
    }

}
