package Milestone_2;

public class M2_L3_StringPalindrome {
    public static boolean isPalindrome(String str) {
        // Your code goes here
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
}