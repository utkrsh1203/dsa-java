package OtherCodes;

import java.util.*;

public class DuplicateAndTheirFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        int freq[] = new int[n];
        int index = 0;
        int m;
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            boolean isThere = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == m) {
                    isThere = true;
                    freq[j]++;
                    break;
                }
            }
            if (!(isThere)) {
                arr[index] = m;
                freq[index]++;
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            if (freq[i] > 1) {

                System.out.println(arr[i] + " " + freq[i]);
            }
        }
        sc.close();

    }
}
