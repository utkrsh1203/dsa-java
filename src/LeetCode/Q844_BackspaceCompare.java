package LeetCode;

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

public class Q844_BackspaceCompare {
    public String finalStr(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            int cnt = 0;
            if (s.charAt(i) == '#') {
                i--;
                cnt++;
            }
            for (int j = 0; j < cnt; j++) {
                i--;
            }
            if (i >= 0) {
                str += s.charAt(i);
            } else {
                break;
            }
        }
        return str;
    }

    public boolean backspaceCompare(String s, String t) {
        s = finalStr(s);
        t = finalStr(t);
        if (s.compareTo(t) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
