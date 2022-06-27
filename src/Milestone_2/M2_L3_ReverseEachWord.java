package Milestone_2;

public class M2_L3_ReverseEachWord {

    // Method 1 : O(n2) + Brute Force
    // public static String reverse(String str) {
    // String str1 = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // str1 += str.charAt(i);
    // }
    // return str1;
    // }

    // public static String reverseEachWord(String str) {
    // // Your code goes here
    // String temp = "";
    // String str1 = "";

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) != ' ') {
    // temp += str.charAt(i);
    // } else {
    // str1 += reverse(temp) + " ";
    // temp = "";
    // }
    // }
    // str1 += reverse(temp) + " ";

    // return str1;
    // }

    // Method 2 : Better O(n)

    public static String reverseEachWord(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                // Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                // Add it final String(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }

    public static void main(String[] args) {
        String str = "Nimish is a good girl";
        System.out.println(reverseEachWord(str));
    }

}
