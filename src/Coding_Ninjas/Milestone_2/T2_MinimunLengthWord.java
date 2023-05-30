package Coding_Ninjas.Milestone_2;

public class T2_MinimunLengthWord {
    public static String minLengthWord(String input) {

        // Write your code here
        int space = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                space++;
            }
        }
        if (space == 0) {
            return input;
        }

        int arr[] = new int[space];

        int start = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                arr[start] = i;
                start++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int minLength = Integer.MAX_VALUE;

        int first = 0, last = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i] - 1) < minLength) {
                first = arr[i] + 1;
                last = arr[i + 1];
                minLength = arr[i + 1] - arr[i] - 1;
            }
        }

        System.out.println("Min length = " + minLength);
        if (arr[0] <= minLength) {
            return input.substring(0, arr[0]);
        } else if ((input.length() - arr[start - 1]) <= minLength) {
            return input.substring(arr[start - 1], input.length());
        }

        String min = input.substring(first, last);
        return min;

    }

    public static void main(String[] args) {
        System.out.println(minLengthWord("yo Hello WOrld is the"));
    }
}
