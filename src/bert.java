import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bert {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int modInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1)
            return 0;

        while (a > 1) {

            q = a / m;
            t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0)
            x1 += m0;

        return x1;
    }

    public static List<Integer> findSmallestSequence(int n) {
        List<Integer> sequence = new ArrayList<>();

        if (isPrime(n)) {
            for (int i = 1; i < n - 1; i++) {
                sequence.add(i);
            }
            return sequence;
        }

        int inverse = modInverse(n - 1, n);

        for (int i = 2; i < n - 1; i++) {
            if ((i * inverse) % n != 1) {
                sequence.add(i);
            }
        }

        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> sequence = findSmallestSequence(n);
        System.out.println(sequence);
    }

}
