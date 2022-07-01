package LeetCode;

public class Q14_LongestCommonPrefix {
    public String commonPrefix(String str1, String str2) {
        int i = 0, j = 0;
        String common = "";
        while (i < str1.length() && j < str2.length() && str1.charAt(i) == str2.charAt(j)) {
            common += str1.charAt(i);
            i++;
            j++;
        }
        return common;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String c = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            String new1 = commonPrefix(strs[i], strs[i + 1]);
            if (commonPrefix(c, new1) != c) {
                String new2 = commonPrefix(c, new1);
                if (new2.length() == 0) {
                    return "";
                }
                c = new2;

            }
        }
        return c;
    }
}
