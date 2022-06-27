package CodeStudio;
// import java.util.ArrayList;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(long n) {
        // ArrayList<Integer> st = new ArrayList<>();
        // Write your code here.
        long start = 0;
        long end = n / 2;

        if (n == 1 || n == 0) {
            return true;
        }

        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == n) {
                return true;
            } else if (mid * mid > n) {
                end = mid - 1;
            }
            if (mid * mid < n) {
                start = mid + 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}
