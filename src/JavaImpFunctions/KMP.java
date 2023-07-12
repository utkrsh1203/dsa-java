package JavaImpFunctions;

public class KMP {

}

class Solution {
    public int strStr(String string, String pattern) {
        int[] lps = new int[pattern.length()];
        lps[0] = 0;

        for (int i = 1; i < pattern.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        int j = 0;
        int i = 0;

        while (i < string.length()) {
            if (string.charAt(i) == pattern.charAt(j)) {
                j++;
                if (j == pattern.length())
                    return i - pattern.length() + 1;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }

        }

        return -1;

    }
}
