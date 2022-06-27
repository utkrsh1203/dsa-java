package Milestone_2;

public class M2_L3_HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {

        // If string is empty then return null

        if (str.length() == 0) {
            return '\0';
        }

        // Storing the frequency of each character in the string
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int j = str.charAt(i) - 'a';
            arr[j]++;
        }

        // Calculating the max frequency from the array

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        // Method 1
        // If the frequency of char in string is max then return that char
        for (int i = 0; i < str.length(); i++) {
            if (arr[(int) str.charAt(i) - 'a'] == max) {
                return str.charAt(i);
            }
        }
        return '\0';

        // Method 2

        // Creating an array containing values of character(a=0, b=1) whose frequency is
        // max
        // int j = 0;
        // int arr2[] = new int[str.length()];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == max) {
        // arr2[j] = i;
        // j++;
        // }
        // }

        // Swapping the value of character with the index at which they appear in the
        // string

        // for (int i = 0; i < j; i++) {
        // for (int k = 0; k < str.length(); k++) {
        // if (str.charAt(k) - 'a' == (char) arr2[i]) {
        // arr2[i] = k;
        // break;
        // }
        // }
        // }

        // Finding the minimum index at which maximum frequency elements occurs
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < j; i++) {
        // if (arr2[i] < min) {
        // min = arr2[i];
        // }
        // }

        // return str.charAt(min);
    }

    public static void main(String[] args) {
        System.out.println(highestOccuringChar("abbcbccd"));
    }

}
