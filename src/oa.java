import java.util.*;

class AverageSubsets {
    public static void main(String[] args) {
        int[] A = { 10, 9, 13, 9 };
        boolean result = strictlyIncreasing(A);
        System.out.println(result);
    }

    public static boolean strictlyIncreasing(int[] A) {
        int n = A.length;
        int[] original = Arrays.copyOf(A, n);
        Arrays.sort(A);
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (original[i] != A[i]) {
                boolean found = false;
                for (int j = 2; j <= original[i]; j++) {
                    if (isPrime(j) && !used[i] && original[i] - j >= A[i]) {
                        original[i] -= j;
                        used[i] = true;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
