package Milestone_2;

public class M2_L2_SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            num1 = num1 * 10 + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            num2 = num2 * 10 + arr2[i];
        }

        int num = num1 + num2;
        int len = Integer.toString(num).length();
        int n = len;
        while (num > 0) {
            if (len == arr2.length || len == arr1.length) {
                output[n] = num % 10;
            } else {
                output[n - 1] = num % 10;
            }
            num = num / 10;
            n--;
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 6, 9, 8 };
        int arr2[] = { 5, 9, 2 };
        int output[] = new int[arr1.length + 1];
        sumOfTwoArrays(arr1, arr2, output);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");

        }
    }

}
