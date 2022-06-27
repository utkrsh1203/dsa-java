package Milestone_2;

public class M2_L3_ReverseStringWordwise {
    public static String ReverseStringWordwise(String str) {
        String ans = "";

        int start = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ans = str.substring(start, i) + " " + ans;
                start = i + 1;
            }

        }
        ans = str.substring(start, i) + " " + ans;

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(ReverseStringWordwise(""));
    }
}
