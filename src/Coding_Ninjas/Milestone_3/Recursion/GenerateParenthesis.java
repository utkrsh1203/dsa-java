package Coding_Ninjas.Milestone_3.Recursion;

import java.util.*;

public class GenerateParenthesis {
    List<String> str = new ArrayList<>();

    public void help(int co, String ans, int cc) {
        if (co == 0 && cc == 0) {
            str.add(ans);
            return;
        }
        if (co > cc) {
            return;
        }
        if (co > 0) {
            help(co - 1, ans + "(", cc);

        }
        if (cc > 0) {
            help(co, ans + ")", cc - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        String ans = "";
        help(n, ans, n);
        return str;
    }
}
