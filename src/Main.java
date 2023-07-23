import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Pair<Integer, Integer>> arr = new ArrayList<>(n + 1);
            for (int i = 1; i < n + 1; i++) {
                arr.add(new Pair<>(scanner.nextInt(), i));
            }
            Collections.sort(arr);
            int q = scanner.nextInt();
            for (int i = 0; i < q; i++) {
                int c = scanner.nextInt();
                int k = scanner.nextInt();
                int[] broken = new int[n + 1];
                for (int j = 0; j < k; j++) {
                    int num = scanner.nextInt();
                    broken[num] = 1;
                }
                int sum = 0;
                int ind = 1;
                int ans = 0;
                while (ind < n + 1) {
                    if (broken[arr.get(ind).second] == 0) {
                        if (sum + arr.get(ind).first <= c) {
                            sum += arr.get(ind).first;
                            ans++;
                        } else {
                            break;
                        }
                    }
                    ind++;
                }
                System.out.print(ans + " ");
                Arrays.fill(broken, 0);
            }
        }
        scanner.close();
    }

    static class Pair<T, U> implements Comparable<Pair<T, U>> {
        T first;
        U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair<T, U> other) {
            if (this.first.equals(other.first)) {
                return ((Comparable) this.second).compareTo(other.second);
            }
            return ((Comparable) this.first).compareTo(other.first);
        }
    }
}
