package Milestone_2;

public class M2_L3_CompressTheString {
    public static String getCompressedString(String str) {
        // Write your code here.
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                int cnt = 1;
                while (str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                    cnt++;
                    if (i + 1 == str.length()) {
                        break;
                    }
                }
                str1 += str.charAt(i) + Integer.toString(cnt);

            } else {
                str1 += str.charAt(i);
            }
        }
        return str1;

    }

    public static void main(String[] args) {
        System.out.println(getCompressedString("aaaadssidosddlgg"));
    }
}
