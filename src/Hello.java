import java.util.ArrayList;
import java.util.List;

class SequenceProblem {

    public static List<Integer> findTheSequence(int n) {
        long m = n;
        long t = Integer.MAX_VALUE;
        long u = 1;
        List<Integer> v = new ArrayList<>();
        for (int i = 1; i < m; i++) {
            if (gcd(i, m) == 1) {
                v.add(i);
                u *= i;
                u %= m;
            }
        }
        List<Integer> ans = new ArrayList<>();

        if (u == 1) {
            for (int i : v) {
                ans.add(i);
            }
        } else {
            for (int i : v) {
                if (u != i) {
                    ans.add(i);
                }
            }
        }

        return ans;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> sequence = findTheSequence(n);

        for (int i : sequence) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}