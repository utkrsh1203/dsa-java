package College;

import java.util.*;

public class lab3_2 {

    public static void pwc(int[] arr) {
        // Your code goes here

        int s = 0, e = arr.length - 1;
        int cmp = 0;
        while (s <= e) {
            int m = (s + e) / 2;
            cmp++;
            if ((m == 0 || (arr[m] > arr[m - 1])) && (m == arr.length - 1 || (arr[m] > arr[m + 1]))) {
                System.out.println(m);
                System.out.println("No of Comparisons = " + " " + (cmp));

                return;
            } else if (arr[m] < arr[m - 1]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number : ");
            int j = sc.nextInt();
            arr[i] = j;
        }
        sc.close();
        pwc(arr);
    }
}
