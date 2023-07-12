public class luffy {
    public static int luffy(String s) {

        int step = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isSpecial(s.charAt(i))) {
                ans = Math.max(ans, step);
                step = 0;
            } else {
                step++;
            }
        }

        if (step == s.length()) {
            return -1;
        }

        ans = Math.max(step, ans);

        return ans + 1;

    }

    public static boolean isSpecial(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return false;
        else
            return true;
    }

    public static void main(String[] args) {

        System.out.println(luffy("ABCSD"));

    }

}
