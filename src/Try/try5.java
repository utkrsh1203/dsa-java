package Try;

import java.util.*;

public class try5 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        int subArr[] = Arrays.copyOfRange(arr, 1, 4);

        for (int i = 0; i < subArr.length; i++) {
            System.out.println(subArr[i]);
        }
    }
}
