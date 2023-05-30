package Milestone_3.Recursion;

public class ReplaceAatBinString {

    public static String replace(String str, char a, char b) {
        if (str.length() == 0) {
            return str;
        }

        String subStr = replace(str.substring(1), a, b);
        if (str.charAt(0) == a) {
            return b + subStr;
        } else {
            return str.charAt(0) + subStr;
        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(replace(str, 'o', 'u'));
    }

}
