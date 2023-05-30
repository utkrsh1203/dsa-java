package Milestone_3.Recursion;

import java.util.Arrays;

public class SumOfArray {
    public static int sum(int input[]) {
        if (input.length == 0) {
            return 0;
        }

        return input[0] + sum(Arrays.copyOfRange(input, 1, input.length));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr));
    }
}
