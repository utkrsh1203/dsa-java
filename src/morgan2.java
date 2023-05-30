import java.util.*;

class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }

}

public class morgan2 {
    public static void main(String[] args) {
        // int m =;
        // int n =;

        // for()

        int[][] arr = { { 3, 2 }, { 3, 5 }, { 6, 7 } };

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int ans = 0;

        Stack<Pair> st = new Stack<>();

        st.push(new Pair(arr[0][0], arr[0][1]));

        for (int i = 1; i < arr.length; i++) {
            if (arr[1][0] < st.peek().j) {

                Pair curr = st.pop();

                st.push(new Pair(curr.i, arr[1][1]));
            } else {
                st.push(new Pair(arr[i][0], arr[i][1]));
            }
            ans = Math.max(ans, st.peek().i - st.peek().j);
        }

        System.out.println(ans);
    }
}
